package ioc.typeOfInjection.SetterBaed;

import org.springframework.stereotype.Component;

@Component
public interface MessageService {
    public void sendMessage(String msg);
}
