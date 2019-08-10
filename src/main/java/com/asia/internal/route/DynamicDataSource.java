package com.asia.internal.route;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 动态数据源
 * AbstractRoutingDataSource(每执行一次数据库，动态获取DataSource)
 * @author manco
 * @since 2019/03/20 08:28
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceContextHolder.getDataSourceType();
    }
}
