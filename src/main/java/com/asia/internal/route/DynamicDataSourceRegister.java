package com.asia.internal.route;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotationMetadata;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * 动态数据源注册
 * @author manco
 * @since 2019/03/20 10:42
 */
@SuppressWarnings("unchecked")
public class DynamicDataSourceRegister implements ImportBeanDefinitionRegistrar, EnvironmentAware {

    private static final Logger logger = LoggerFactory.getLogger(DynamicDataSourceRegister.class);

    /**
     * 指定默认数据源(springboot2.0默认数据源是hikari: com.zaxxer.hikari.HikariDataSource)
     * 这里采用Druid
     */
    private static final String DATASOURCE_TYPE_DEFAULT = "com.alibaba.druid.pool.DruidDataSource";

    private static final String DATASOURCE_KEY_DEFAULT = "DefaultDataSource";

    private static final String KEY_PRE = ",";

    private static final  int DEFAULT_SIZE = 16;

    /**
     * 默认数据源
     */
    private DataSource defaultDataSource;

    /**
     * 用户自定义数据源
     */
    private Map<String, DataSource> slaveDataSources = new HashMap<>(DEFAULT_SIZE);

    @Override
    public void setEnvironment(Environment environment) {
        initDefaultDataSource(environment);
        initslaveDataSources(environment);
    }

    /**
     * 默认数据源
     * @param env 配置文件和属性
     */
    private void initDefaultDataSource(Environment env) {
        Map<String, Object> dsMap = new HashMap<>(DEFAULT_SIZE);
        dsMap.put("driver-class-name", env.getProperty("spring.datasource.driver-class-name"));
        dsMap.put("url", env.getProperty("spring.datasource.url"));
        dsMap.put("username", env.getProperty("spring.datasource.username"));
        dsMap.put("password", env.getProperty("spring.datasource.password"));
        defaultDataSource = buildDataSource(dsMap);
    }


    /**
     * 读取配置文件获取更多数据源
     * @param env 配置文件和属性
     */
    private void initslaveDataSources(Environment env) {
        String dsPrefixs = env.getProperty("spring.datasource.names");
        for (String dsPrefix : dsPrefixs.split(KEY_PRE)) {
            Map<String, Object> dsMap = new HashMap<>(DEFAULT_SIZE);
            dsMap.put("driver-class-name", env.getProperty("spring.datasource." + dsPrefix + ".driver-class-name"));
            dsMap.put("type", env.getProperty("spring.datasource." + dsPrefix + ".type"));
            dsMap.put("url", env.getProperty("spring.datasource." + dsPrefix + ".url"));
            dsMap.put("username", env.getProperty("spring.datasource." + dsPrefix + ".username"));
            dsMap.put("password", env.getProperty("spring.datasource." + dsPrefix + ".password"));
            DataSource ds = buildDataSource(dsMap);
            slaveDataSources.put(dsPrefix, ds);
        }
    }

    /**
     * 注册所有的数据源对象到容器
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        Map<Object, Object> targetDataSources = new HashMap<>(DEFAULT_SIZE);
        //添加默认数据源
        targetDataSources.put(DATASOURCE_KEY_DEFAULT, this.defaultDataSource);
        DynamicDataSourceContextHolder.dataSourceIds.add(DATASOURCE_KEY_DEFAULT);
        //添加其他数据源
        targetDataSources.putAll(slaveDataSources);
        for (String key : slaveDataSources.keySet()) {
            DynamicDataSourceContextHolder.dataSourceIds.add(key);
        }
        //创建DynamicDataSource
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(DynamicDataSource.class);
        beanDefinition.setSynthetic(true);
        MutablePropertyValues mpv = beanDefinition.getPropertyValues();
        mpv.addPropertyValue("defaultTargetDataSource", defaultDataSource);
        mpv.addPropertyValue("targetDataSources", targetDataSources);
        //注册 - BeanDefinitionRegistry
        beanDefinitionRegistry.registerBeanDefinition("dataSource", beanDefinition);

        logger.info("Dynamic DataSource Registry");
    }

    public DataSource buildDataSource(Map<String, Object> dataSourceMap) {
        try {
            Object type = dataSourceMap.get("type");
            if (type == null) {
                type = DATASOURCE_TYPE_DEFAULT;
            }
            Class<? extends DataSource> dataSourceType = (Class<? extends DataSource>) Class.forName((String) type);
            String driverClassName = dataSourceMap.get("driver-class-name").toString();
            String url = dataSourceMap.get("url").toString();
            String username = dataSourceMap.get("username").toString();
            String password = dataSourceMap.get("password").toString();
            // 自定义DataSource配置
            DataSourceBuilder factory = DataSourceBuilder.create().driverClassName(driverClassName).url(url)
                    .username(username).password(password).type(dataSourceType);
            return factory.build();
        } catch (ClassNotFoundException e) {
            logger.error("", e);
        }
        return null;
    }
}
