package learning_IOC.StereotypeAnnotation.typeOfInjection.SetterBaed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageSnder {
    private MessageService messageService;

    @Autowired
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage(String msg) {
        messageService.sendMessage(msg);
    }
}
