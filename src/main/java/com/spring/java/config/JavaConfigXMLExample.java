package com.spring.java.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigXMLExample {

    private static String XML = "classpath:xml/app-context-xml.xml";

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(XML);

        MessageRenderer renderer =
                context.getBean("messageRenderer", MessageRenderer.class);
        renderer.render();
    }

}
