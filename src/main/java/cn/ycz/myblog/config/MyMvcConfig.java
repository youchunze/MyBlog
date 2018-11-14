package cn.ycz.myblog.config;

import cn.ycz.myblog.interceptor.LoginInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


//@Configuration
public class MyMvcConfig extends WebMvcConfigurationSupport {
    Logger logger = LoggerFactory.getLogger(WebMvcConfigurationSupport.class);
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        logger.info("添加拦截器");
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/list")
                .excludePathPatterns("/login","/","/index","/static/**");
        super.addInterceptors(registry);
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        logger.info("添加静态资源路径");
        registry.addResourceHandler("/static/**")
                .addResourceLocations("/classpath:/static/");
        super.addResourceHandlers(registry);
    }

    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        super.addViewControllers(registry);
    }
}
