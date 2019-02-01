package com.praveen.dp.gof.bridge.abstraction;
import com.praveen.dp.gof.bridge.implementation.MessageSender;

public class EmailMessage extends Message{
    public EmailMessage(MessageSender messageSender){
        super(messageSender);
    }
    @Override
    public void send(){
        messageSender.sendMessage();
    }

}
