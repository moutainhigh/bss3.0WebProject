package com.asia.internal.route;

import com.asia.internal.common.BillException;
import com.asia.internal.errcode.ErrorCodePublicEnum;
import com.asiainfo.account.model.ActionObject;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 动态数据源通知
 * 注解order(-1)保证在@Transactional之前执行
 * @author manco
 * @since 2019/03/20 14:04
 */
@Aspect
@Order(-1)
@Component
public class DynamicDattaSourceAspect {

    private static final Logger logger = LoggerFactory.getLogger(DynamicDattaSourceAspect.class);
    /**
     * 改变数据源
     * @param actionObject 路由参数
     */
    @Before("@annotation(targetDataSource) && args(actionObject,..)")
    public void changeDataSource(ActionObject actionObject, TargetDataSource targetDataSource) throws BillException {
        Long routeFlag = actionObject.getRouteRuleInfo().getRouteFlag();
        String routeValue = actionObject.getRouteRuleInfo().getRouteValue();
        //数据源计算函数可以在这里调用
        if (!DynamicDataSourceContextHolder.isContainsDataSource(routeValue)) {
            logger.info("未定位到数据源：route:[{} {}]", routeFlag,routeValue);
            throw new BillException(ErrorCodePublicEnum.DATASOURCE_ROUTE_FAILED);
        } else {
            logger.info("使用数据源：route:[{} {}]", routeFlag,routeValue);
            DynamicDataSourceContextHolder.setDataSourceType(routeValue);
        }
    }

    @After("@annotation(targetDataSource) && args(actionObject,..)")
    public void clearDataSource(ActionObject actionObject, TargetDataSource targetDataSource) {
        logger.info("清除数据源：route:[{} {}]", actionObject.getRouteRuleInfo().getRouteFlag(),actionObject.getRouteRuleInfo().getRouteValue());
        DynamicDataSourceContextHolder.clearDataSourceType();
    }
}
