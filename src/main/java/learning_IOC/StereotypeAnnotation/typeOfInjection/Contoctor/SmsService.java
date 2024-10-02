package learning_IOC.StereotypeAnnotation.typeOfInjection.Contoctor;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SmsService implements MessageService{
    @Override
    public void sandMessage(String message) {
        System.out.println("Sms sent: " + message);
    }
}
