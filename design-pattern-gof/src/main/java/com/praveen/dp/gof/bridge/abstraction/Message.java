package com.praveen.dp.gof.bridge.abstraction;

import com.praveen.dp.gof.bridge.implementation.MessageSender;

public abstract class Message {
    MessageSender messageSender;
    public Message(MessageSender messageSender){
        this.messageSender=messageSender;
    }
     abstract public void send();
}
