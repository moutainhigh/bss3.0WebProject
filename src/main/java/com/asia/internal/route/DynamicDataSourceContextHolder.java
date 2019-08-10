package com.asia.internal.route;

import java.util.ArrayList;
import java.util.List;

/**
 * 动态数据源上下文管理
 * @author manco
 * @since 2019/03/20 10:22
 */
public class DynamicDataSourceContextHolder {

    /**
     * 存放当前线程使用的数据源类型信息
     */
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();
    /**
     * 存放数据源标识
     */
    protected static List<String> dataSourceIds = new ArrayList<>();

    /**
     * 设置数据源
     * @param dataSourceType 数据源
     */
    public static void setDataSourceType(String dataSourceType) {
        contextHolder.set(dataSourceType);
    }

    /**
     * 获取数据源
     * @return 数据源
     */
    public static String getDataSourceType() {
        return contextHolder.get();
    }

    /**
     * 清除数据源
     */
    public static void clearDataSourceType() {
        contextHolder.remove();
    }

    /**
     * 判断当前数据源是否存在
     * @param dataSourceId 数据源标识
     * @return 是否成功
     */
    public static boolean isContainsDataSource(String dataSourceId) {
        return dataSourceIds.contains(dataSourceId);
    }
}