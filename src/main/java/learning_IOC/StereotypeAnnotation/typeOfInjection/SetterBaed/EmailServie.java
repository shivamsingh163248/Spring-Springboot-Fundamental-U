package learning_IOC.StereotypeAnnotation.typeOfInjection.SetterBaed;

import org.springframework.stereotype.Component;

@Component

public class EmailServie implements MessageService {
    @Override
    public void sendMessage(String msg) {
        System.out.println("Email: " + msg);
    }
}
