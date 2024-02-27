package ioc.typeOfInjection.Contoctor;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("emailService")

public class EmailService implements  MessageService {
    @Override
    public void sandMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}
