package com.thtf.casclienta.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description: mvc配置类
 * @Author: panyangyang
 * @Date: 2019/5/15 14:32
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     * 配置资源映射
     * @Author: PanYangYang
     * @Date: 2019/5/15 14:33
     * @Param: [registry]
     * @Return: void
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/images/**")
                .addResourceLocations("classpath:/static/images/");
    }
}
