package com.example.INIT.Utils;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;


/**
 * 在 springboot中 , 配置 拦截器
 *
 * @author zzt
 * {@code @date} Created in 2022/10/13/ 15:21
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Resource
    JwtInterceptorD jwtInterceptor;

    /**
     * @param registry 拦截器 的 注册器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 把 拦截器 注册到 Mvc, 同时 设置 拦截 和 放过的 信息
//        registry.addInterceptor(jwtInterceptor).addPathPatterns("/**").excludePathPatterns("/lgin")
//                .excludePathPatterns("/GyDepart").excludePathPatterns("/PullOrPushUser").excludePathPatterns("/sendAllWebSocket");

    }
}
