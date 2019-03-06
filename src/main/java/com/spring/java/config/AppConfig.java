package com.spring.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MessageProvider messageProvider() {
        return new ConfigurableMessageProvider();
    }

    @Bean
    public MessageRenderer messageRenderer(){

        MessageRenderer renderer = new StandardOutMessageRenderer();

        MessageProvider messageProvider = messageProvider();

        renderer.setMessageProvider(messageProvider);

        return renderer;
    }

}
