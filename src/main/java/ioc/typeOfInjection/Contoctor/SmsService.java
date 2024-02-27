package ioc.typeOfInjection.Contoctor;


import org.springframework.stereotype.Component;

@Component
public class SmsService implements MessageService{
    @Override
    public void sandMessage(String message) {
        System.out.println("Sms sent: " + message);
    }
}
