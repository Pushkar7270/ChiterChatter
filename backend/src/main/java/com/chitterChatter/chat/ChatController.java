package com.chitterChatter.chat;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

import com.chitterChatter.Message.MessageModel;
import com.chitterChatter.Message.MessageService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor 
public class ChatController {
    private final MessageService messageService;


    @MessageMapping("/chat.send")
    @SendTo("/topic/public")
    public MessageModel sendMessage(MessageModel message){
        MessageModel savedMessage = messageService.saveMessage(message);
        return savedMessage;

    }
}
