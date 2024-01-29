package com.xx.config;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author Tiger
 * @description: 配置该注解开启cas功能
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(CasClientConfiguration.class)
public @interface EnableCasClient {

}