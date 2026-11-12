package com.chitterChatter.Message;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor 
public class MessageService {
    private final MessageRepository messageRepository;


    
    public MessageModel saveMessage(MessageModel message){
        return messageRepository.save(message);
    }
}
