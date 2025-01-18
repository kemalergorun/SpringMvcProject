package com.tpe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan("com.tpe")
@EnableWebMvc//mvc etkinleşir
public class WebMvcConfig implements WebMvcConfigurer {
    //view resolver objesi oluşturuldu
    @Bean
    public InternalResourceViewResolver resolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");//başlangıçlar öneki
        resolver.setSuffix(".jsp");//uzantılar suffix
        //Let's say that controller sent "students" as view name.
        //If controller sends the view name students: prefix + students + suffix = /WEB-INF/views/students.jsp
        resolver.setViewClass(JstlView.class);
        // JSTL: Java Standard Tag Library: Allows us to have less java code in JSP files.
        return resolver;
    }

    //statik istekler servlete gerek yok webserver statik cvp verir
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/statics/**")
                .addResourceLocations("/resources/") //Location of our static resources.
                .setCachePeriod(0);
    }
}