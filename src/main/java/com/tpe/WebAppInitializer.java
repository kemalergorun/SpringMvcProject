package com.tpe;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//web xml file replacement java based web applications
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{
                RootConfig.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                WebMvcConfig.class
        };
    }

    @Override //All the requests with incoming URL.
    protected String[] getServletMappings() {
        return new String[]{
                "/" // -> /students/new/1 -> Still starts with a "/", so, it will be included.
        };
    }
}
