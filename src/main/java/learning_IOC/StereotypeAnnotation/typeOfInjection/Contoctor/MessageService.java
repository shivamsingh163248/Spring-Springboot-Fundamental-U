package learning_IOC.StereotypeAnnotation.typeOfInjection.Contoctor;

import org.springframework.stereotype.Component;

@Component
public interface MessageService {

    public void sandMessage(String message);
}
