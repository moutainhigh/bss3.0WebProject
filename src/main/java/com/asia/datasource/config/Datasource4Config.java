package com.asia.datasource.config;

import com.alibaba.druid.filter.logging.Slf4jLogFilter;
import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;

@Configuration
//扫描 Mapper 接口并容器管理
@MapperScan(basePackages = Datasource4Config.PACKAGE, sqlSessionFactoryRef = "ds4SqlSessionFactory")
public class Datasource4Config {
    private Logger logger = Logger.getLogger(this.getClass());	//log4j日志
    // 精确到 master 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.asia.mapper.billingmapper";
    static final String MAPPER_LOCATION = "classpath:mapper/billingmapper/*.xml";
    @Value("${ds4.datasource.url}")
    private String url;
    @Value("${ds4.datasource.username}")
    private String user;
    @Value("${ds4.datasource.password}")
    private String password;
    @Value("${ds4.datasource.driverClassName}")
    private String driverClass;
    @Value("${ds4.datasource.druid.validation-query}")
    private String validationQuery;
    @Value("${ds4.datasource.maxActive}")
    private Integer maxActive;
    @Value("${ds4.datasource.minIdle}")
    private Integer minIdle;
    @Value("${ds4.datasource.initialSize}")
    private Integer initialSize;
    @Value("${ds4.datasource.maxWait}")
    private Long maxWait;
    @Value("${ds4.datasource.timeBetweenEvictionRunsMillis}")
    private Long timeBetweenEvictionRunsMillis;
    @Value("${ds4.datasource.minEvictableIdleTimeMillis}")
    private Long minEvictableIdleTimeMillis;
    @Value("${ds4.datasource.testWhileIdle}")
    private Boolean testWhileIdle;
    @Value("${ds4.datasource.testWhileIdle}")
    private Boolean testOnBorrow;
    @Value("${ds4.datasource.testOnBorrow}")
    private Boolean testOnReturn;
    @Value("${ds4.datasource.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;
    @Value("${ds4.datasource.druid.filters}")
    private String filters;
    @Value("${ds4.datasource.druid.connect-properties}")
    private String connectionProperties;
    @Value("${ds4.datasource.druid.use-global-data-source-stat}")
    private boolean userGlobalDataSourceStat;
    @Value("${ds4.datasource.druid.filter.stat.log-slow-sql}")
    private boolean filterStatLogSlowSql;
    @Value("${ds4.datasource.druid.filter.stat.slow-sql-millis}")
    private long fileterStatSlowSqlMillis;
    private String publicKey;
    @Bean(name = "ds4DataSource")
   
    public DataSource ds4DataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);

        //连接池配置
        dataSource.setMaxActive(maxActive);
        dataSource.setMinIdle(minIdle);
        dataSource.setInitialSize(initialSize);
        dataSource.setMaxWait(maxWait);
        dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        dataSource.setTestWhileIdle(testWhileIdle);
        dataSource.setTestOnBorrow(testOnBorrow);
        dataSource.setTestOnReturn(testOnReturn);
        dataSource.setValidationQuery(validationQuery);

        dataSource.setPoolPreparedStatements(true);
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(20);
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
        dataSource.setUseGlobalDataSourceStat(userGlobalDataSourceStat);
        try {
            dataSource.setFilters(filters);
        } catch (SQLException e) {
            //logger.error("druid configuration initialization filter", e);
        }
        dataSource.setConnectionProperties(connectionProperties);
        //dataSource.setProxyFilters(Arrays.asList(statDuridFilter(),logFilter()));
        return dataSource;
    }


    @Bean(name = "ds4TransactionManager")
    public DataSourceTransactionManager ds4TransactionManager() {
        return new DataSourceTransactionManager(ds4DataSource());
    }

    @Bean(name = "ds4SqlSessionFactory")
    public SqlSessionFactory ds4SqlSessionFactory(@Qualifier("ds4DataSource") DataSource ds4DataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(ds4DataSource);
       // sessionFactory.setTypeAliasesPackage("nc.edu.nuc.Test.entity");
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(Datasource4Config.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }

    @Bean(name = "ds4SqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("ds4SqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}