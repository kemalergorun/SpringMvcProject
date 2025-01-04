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
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
