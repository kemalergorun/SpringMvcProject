package com.tpe;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//web xml file replacement java based web applications web xml yerine kullan
//dispatcher servlet başlatılması için configure için
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {//hibernate ve jdbc class config for
        return new Class[]{
                RootConfig.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {//view resolver,handler mapping,
        return new Class[]{
                WebMvcConfig.class
        };
    }

    @Override //All the requests with incoming URL servlet tarafından karşılanır.
    protected String[] getServletMappings() {
        return new String[]{
                "/" // -> /students/new/1 -> Still starts with a "/", so, it will be included.
        };
    }
}
