package learning_IOC.StereotypeAnnotation.typeOfInjection.SetterBaed;

import org.springframework.stereotype.Component;

@Component
public interface MessageService {
    public void sendMessage(String msg);
}
