package com.talkietalk.app.controller;

import org.springframework.stereotype.Controller;

import com.talkietalk.app.model.ChatMessage;

@Controller 
public class ChatController {

    public ChatMessage sendMessage(ChatMessage message){
        return message;

    }
}
