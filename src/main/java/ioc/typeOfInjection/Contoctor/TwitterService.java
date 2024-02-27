package ioc.typeOfInjection.Contoctor;

import org.springframework.stereotype.Component;

@Component
public class TwitterService implements MessageService {

    @Override
    public void sandMessage(String message) {
        System.out.println("Twitter sent: " + message);
    }
}
