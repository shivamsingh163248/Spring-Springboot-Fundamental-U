package ioc.typeOfInjection.FildBasedDependacyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSander {

    @Autowired
    @Qualifier("sms")
    private MessageService messageService;
    @Autowired
    private MessageService messageService2;

    public void sandMessage(String message){
        messageService.sandMessage(message);
        messageService2.sandMessage(message);

    }


}
