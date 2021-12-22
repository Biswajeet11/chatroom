package com.chatapp.chatroom.controller;

import com.chatapp.chatroom.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @MessageMapping("/message")
    @SendTo("/topic/return-to")
    /*
    * "/topic/return-to" route to subscribe so that we can receive messages */
    public Message getContent(@RequestBody Message message) throws InterruptedException {
            // all processing like saving data and getting can be done here
            Thread.sleep(2000);

        return message;
    }
}
