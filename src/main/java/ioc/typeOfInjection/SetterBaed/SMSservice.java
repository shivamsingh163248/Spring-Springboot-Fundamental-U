package ioc.typeOfInjection.SetterBaed;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SMSservice  implements  MessageService{
    @Override
    public void sendMessage(String msg) {
        System.out.println("Sms: " + msg);
    }
}
