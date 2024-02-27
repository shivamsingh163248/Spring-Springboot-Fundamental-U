package ioc.typeOfInjection.TwoContoctor;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Email implements MessageSERVICE{
    @Override
    public void sendMessage(String msg) {
        System.out.println("Email: " + msg);
    }
}

