package ioc.typeOfInjection.Contoctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageSnder {

    // creating the instance of the MessageService interface
    MessageService messageService;

    // now creating the constructor of the MessageSnder class

    @Autowired
    public MessageSnder(MessageService messageService) {
        this.messageService = messageService;
    }

    // now creating the method to send the message
    public void sendMessage(String message) {
        messageService.sandMessage(message);
    }
}
