package com.spring.java.config;

import com.spring.java.config.MessageProvider;
import com.spring.java.config.MessageRenderer;

public class StandardOutMessageRenderer implements MessageRenderer {


    private MessageProvider messageProvider = null;

    /*Визуализация*/
    @Override
    public void render() {

        if (this.messageProvider == null){
            throw new RuntimeException(
                    " Вы должны установить свойство 'messageProvider' для класса :"
                            + StandardOutMessageRenderer.class.getName());
        }

        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
      this.messageProvider = provider;
    }


    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
