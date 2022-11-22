package com.project.washer.jameswebsite.config;

import com.project.washer.jameswebsite.util.ViewNames;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.project.washer.jameswebsite")
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName(ViewNames.HOMEPAGE);
    }

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        if(!registry.hasMappingForPattern("/static/**")){
//            registry.addResourceHandler("/static/**").addResourceLocations("classpath:static");
//        }
//    }
}
