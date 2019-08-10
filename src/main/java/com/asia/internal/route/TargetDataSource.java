package com.asia.internal.route;

import java.lang.annotation.*;

/**
 * 作用于类、接口或者方法上
 * @author manco
 * @since 2019/03/20 14:01
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
public @interface TargetDataSource {
    String value() default "DefaultDataSource";
}