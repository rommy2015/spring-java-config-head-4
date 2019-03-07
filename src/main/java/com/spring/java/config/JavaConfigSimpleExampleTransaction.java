package com.spring.java.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigSimpleExampleTransaction {

    public static void main(String[] args) {


        ApplicationContext context = new
                AnnotationConfigApplicationContext(AppConfigTransaction.class);

        MessageRenderer renderer =
                context.getBean("messageRenderer", MessageRenderer.class);
        renderer.render();
    }
}
