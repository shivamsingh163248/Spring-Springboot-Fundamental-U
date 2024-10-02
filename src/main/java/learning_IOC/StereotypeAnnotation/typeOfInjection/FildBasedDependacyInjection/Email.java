package learning_IOC.StereotypeAnnotation.typeOfInjection.FildBasedDependacyInjection;

import org.springframework.stereotype.Component;

@Component("email")
public class Email implements  MessageService{
    @Override
    public void sandMessage(String message) {
        System.out.println("Email: " + message);
    }
}
