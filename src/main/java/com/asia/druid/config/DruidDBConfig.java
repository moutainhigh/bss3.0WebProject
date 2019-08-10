/*package com.asia.druid.config;

@Configuration
public class DruidDBConfig {
	private Logger logger = Logger.getLogger(this.getClass());	//log4j日志
	
    @Value("${spring.datasource.url}")
    private String dbUrl;
    
    @Value("${spring.datasource.username}")
    private String username;
    
    @Value("${spring.datasource.password}")
    private String password;
    
    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;
    
    @Value("${spring.datasource.druid.initial-size}")
    private int initialSize;
    
    @Value("${spring.datasource.druid.min-idle}")
    private int minIdle;
    
    @Value("${spring.datasource.druid.max-active}")
    private int maxActive;
    
    @Value("${spring.datasource.druid.max-wait}")
    private int maxWait;
    
    @Value("${spring.datasource.druid.time-between-eviction-runs-millis}")
    private int timeBetweenEvictionRunsMillis;
    
    @Value("${spring.datasource.druid.min-evictable-idle-time-millis}")
    private int minEvictableIdleTimeMillis;
    
    @Value("${spring.datasource.druid.validation-query}")
    private String validationQuery;
    
    @Value("${spring.datasource.druid.test-while-idle}")
    private boolean testWhileIdle;
    
    @Value("${spring.datasource.druid.test-on-borrow}")
    private boolean testOnBorrow;
    
    @Value("${spring.datasource.druid.test-on-return}")
    private boolean testOnReturn;
    
    @Value("${spring.datasource.druid.pool-prepared-statements}")
    private boolean poolPreparedStatements;
    
    @Value("${spring.datasource.druid.max-pool-prepared-statement-per-connection-size}")
    private int maxPoolPreparedStatementPerConnectionSize;
    
    @Value("${spring.datasource.druid.filters}")
    private String filters;
    
    @Value("${spring.datasource.druid.connect-properties}")
    private String connectionProperties;

    @Value("${spring.datasource.druid.use-global-data-source-stat}")
    private boolean userGlobalDataSourceStat;

    @Value("${spring.datasource.druid.filter.stat.log-slow-sql}")
    private boolean filterStatLogSlowSql;

    @Value("${spring.datasource.druid.filter.stat.slow-sql-millis}")
    private long fileterStatSlowSqlMillis;
    @Bean     //声明其为Bean实例
    @Primary  //在同样的DataSource中，首先使用被标注的DataSource
    public DataSource dataSource(){
    	DruidDataSource datasource = new DruidDataSource();
    	
    	datasource.setUrl(this.dbUrl);
    	datasource.setUsername(username);
    	datasource.setPassword(password);
    	datasource.setDriverClassName(driverClassName);
    	
    	//configuration
    	datasource.setInitialSize(initialSize);
    	datasource.setMinIdle(minIdle);
    	datasource.setMaxActive(maxActive);
    	datasource.setMaxWait(maxWait);
    	datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
    	datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
    	datasource.setValidationQuery(validationQuery);
    	datasource.setTestWhileIdle(testWhileIdle);
    	datasource.setTestOnBorrow(testOnBorrow);
    	datasource.setTestOnReturn(testOnReturn);
    	datasource.setPoolPreparedStatements(poolPreparedStatements);
    	datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
    	datasource.setUseGlobalDataSourceStat(userGlobalDataSourceStat);
    	try {
			datasource.setFilters(filters);
        } catch (SQLException e) {
			logger.error("druid configuration initialization filter", e);
		}
    	datasource.setConnectionProperties(connectionProperties);
        datasource.setProxyFilters(Arrays.asList(statFilter(),logFilter()));
    	return datasource;
    }
    @Bean
    @Primary
    public StatFilter statFilter(){
        StatFilter statFilter = new StatFilter();
        statFilter.setSlowSqlMillis(fileterStatSlowSqlMillis);
        statFilter.setLogSlowSql(filterStatLogSlowSql);
        //statFilter.setMergeSql(mergeSql);
        return statFilter;
    }
    @Bean
    public Slf4jLogFilter logFilter(){
        Slf4jLogFilter filter = new Slf4jLogFilter();
//        filter.setResultSetLogEnabled(false);
//        filter.setConnectionLogEnabled(false);
//        filter.setStatementParameterClearLogEnable(false);
//        filter.setStatementCreateAfterLogEnabled(false);
//        filter.setStatementCloseAfterLogEnabled(false);
//        filter.setStatementParameterSetLogEnabled(false);
//        filter.setStatementPrepareAfterLogEnabled(false);
        return  filter;
    }
}*/