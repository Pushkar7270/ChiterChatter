package com.chitterChatter.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;


/**
 * Configuration is the structural space where the messaging tool (and the rest
 * of the infrastructure) is defined, birthed, and made available.
 * 
 * Message broker is the tool that lets chatting happen. STOMP(Simple Text
 * Oriented Messaging Protocol) is the protocol that dictates how the messaging
 * would work.
 *
 *     */
@Configuration 
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer{
    /**
     * message broker configurer
     * */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry config){
        config.enableSimpleBroker("/topic");
        config.setApplicationDestinationPrefixes("/app");
    }
    /**    (non-Javadoc)
     * An endpoint is like a url address that lets (say frontend) use the service
     * Prefixes is the is a sub-address inside that URL that tells which service to use
     * @see org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer#registerStompEndpoints(org.springframework.web.socket.config.annotation.StompEndpointRegistry)
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry){
        registry.addEndpoint("/ws").withSockJS();
    }
}
