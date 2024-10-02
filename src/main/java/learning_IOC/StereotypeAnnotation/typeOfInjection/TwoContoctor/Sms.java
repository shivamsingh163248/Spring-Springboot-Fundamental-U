package learning_IOC.StereotypeAnnotation.typeOfInjection.TwoContoctor;

import org.springframework.stereotype.Component;

@Component
public class Sms implements MessageSERVICE{
    @Override
    public void sendMessage(String msg) {
        System.out.println("SMS: " + msg);
    }
}
