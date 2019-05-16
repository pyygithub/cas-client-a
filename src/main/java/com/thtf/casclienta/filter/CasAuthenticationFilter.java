package com.thtf.casclienta.filter;

import org.jasig.cas.client.authentication.AuthenticationFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: panyangyang
 * @Date: 2019/5/15 14:21
 */
@Configuration("CasAuthenticationFilter")
public class CasAuthenticationFilter {
    @Value(value = "${cas.server-login-url}")
    private String CAS_SERVER_LOGIN_URL;

    @Value(value = "${cas.client-host-url}")
    private String SERVER_NAME;

    //不需要认证的接口
    @Value(value = "${ignore-pattern.paths}")
    private String IGNORE_PATTERN;

    @Value(value = "${ignore-url-pattern-type}")
    private String IGNORE_URL_PATTERN_TYPE;


    @Bean
    public FilterRegistrationBean filterAuthenticationRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new AuthenticationFilter());
        Map<String,String> initParameters = new HashMap<String, String>();
        initParameters.put("casServerLoginUrl", CAS_SERVER_LOGIN_URL);
        initParameters.put("serverName", SERVER_NAME);
        initParameters.put("ignorePattern", IGNORE_PATTERN);
        initParameters.put("ignoreUrlPatternType", IGNORE_URL_PATTERN_TYPE);
        registration.setInitParameters(initParameters);
        // 设定加载的顺序
        registration.setOrder(1);
        return registration;
    }
}
