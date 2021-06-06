package com.github.jarris3154.config;

import com.github.jarris3154.handlers.TextHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
public class Config implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(textHandler(), "/myHandler");
    }

    @Bean
    public TextHandler textHandler(){
        return new TextHandler();
    }
}
