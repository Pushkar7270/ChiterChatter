package com.chitterChatter.chat;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller 
public class ChatController {


    @MessageMapping("/chat")        //recieves the messages
    @SendTo("/topic/messages")      //sends the messages
    public ChatMessageModel send(ChatMessageModel message){
        return message;
    }
}
