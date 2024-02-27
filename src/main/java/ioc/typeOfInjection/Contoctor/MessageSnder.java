package ioc.typeOfInjection.Contoctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSnder {

    // creating the instance of the MessageService interface
    MessageService messageService;
    MessageService emailService;


    // now creating the constructor of the MessageSnder class


    public MessageSnder(MessageService messageService) {

        this.messageService = messageService;
    }
    @Autowired
    public MessageSnder(MessageService messageService , @Qualifier("emailService") MessageService emailService) {

        this.messageService = messageService;
        this.emailService = emailService ;
    }

    // now creating the method to send the message
    public void sendMessage(String message) {
        messageService.sandMessage(message);
        emailService.sandMessage(message);
}
}
