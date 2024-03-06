package ioc.typeOfInjection.FildBasedDependacyInjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Sms implements MessageService{
    @Override
    public void sandMessage(String message) {
        System.out.println("Email: " + message);
    }
}
