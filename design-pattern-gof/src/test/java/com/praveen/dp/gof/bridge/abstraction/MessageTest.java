package com.praveen.dp.gof.bridge.abstraction;

import org.junit.Test;

import com.praveen.dp.gof.bridge.abstraction.Message;
import com.praveen.dp.gof.bridge.abstraction.TextMessage;
import com.praveen.dp.gof.bridge.implementation.EmailMessageSender;
import com.praveen.dp.gof.bridge.implementation.MessageSender;
import com.praveen.dp.gof.bridge.implementation.TextMessageSender;

import static org.junit.Assert.*;


public class MessageTest {

    @Test
    public void testSend() throws Exception {
      MessageSender textMessageSender=new TextMessageSender();
      Message textMessage=new TextMessage(textMessageSender);
      textMessage.send();

       MessageSender emailMessageSender=new EmailMessageSender();
       Message emailMessage=new TextMessage(emailMessageSender);
       emailMessage.send();
    }
}