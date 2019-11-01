package com.asia.datasource.config;

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
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
//扫描 Mapper 接口并容器管理
@MapperScan(basePackages = Datasource5Config.PACKAGE, sqlSessionFactoryRef = "ds5SqlSessionFactory")
public class Datasource5Config {
    private Logger logger = Logger.getLogger(this.getClass());	//log4j日志
    // 精确到 master 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.asia.mapper.cpcpmapper";
    static final String MAPPER_LOCATION = "classpath:mapper/cpcpmapper/*.xml";
    @Value("${ds5.datasource.url}")
    private String url;
    @Value("${ds5.datasource.username}")
    private String user;
    @Value("${ds5.datasource.password}")
    private String password;
    @Value("${ds5.datasource.driverClassName}")
    private String driverClass;
    @Value("${ds5.datasource.druid.validation-query}")
    private String validationQuery;
    @Value("${ds5.datasource.maxActive}")
    private Integer maxActive;
    @Value("${ds5.datasource.minIdle}")
    private Integer minIdle;
    @Value("${ds5.datasource.initialSize}")
    private Integer initialSize;
    @Value("${ds5.datasource.maxWait}")
    private Long maxWait;
    @Value("${ds5.datasource.timeBetweenEvictionRunsMillis}")
    private Long timeBetweenEvictionRunsMillis;
    @Value("${ds5.datasource.minEvictableIdleTimeMillis}")
    private Long minEvictableIdleTimeMillis;
    @Value("${ds5.datasource.testWhileIdle}")
    private Boolean testWhileIdle;
    @Value("${ds5.datasource.testWhileIdle}")
    private Boolean testOnBorrow;
    @Value("${ds5.datasource.testOnBorrow}")
    private Boolean testOnReturn;
    @Value("${ds5.datasource.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;
    @Value("${ds5.datasource.druid.filters}")
    private String filters;
    @Value("${ds5.datasource.druid.connect-properties}")
    private String connectionProperties;
    @Value("${ds5.datasource.druid.use-global-data-source-stat}")
    private boolean userGlobalDataSourceStat;
    @Value("${ds5.datasource.druid.filter.stat.log-slow-sql}")
    private boolean filterStatLogSlowSql;
    @Value("${ds5.datasource.druid.filter.stat.slow-sql-millis}")
    private long fileterStatSlowSqlMillis;
    private String publicKey;
    @Bean(name = "ds5DataSource")
   

    public DataSource ds5DataSource() throws SQLException {
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
        dataSource.init();
        return dataSource;
    }

    @Bean(name = "ds5TransactionManager")
    public DataSourceTransactionManager ds5TransactionManager() throws SQLException {
        return new DataSourceTransactionManager(ds5DataSource());
    }

    @Bean(name = "ds5SqlSessionFactory")
    public SqlSessionFactory ds5SqlSessionFactory(@Qualifier("ds5DataSource") DataSource ds5DataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(ds5DataSource);
       // sessionFactory.setTypeAliasesPackage("nc.edu.nuc.Test.entity");
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(Datasource5Config.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
    @Bean(name = "ds5SqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("ds5SqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}