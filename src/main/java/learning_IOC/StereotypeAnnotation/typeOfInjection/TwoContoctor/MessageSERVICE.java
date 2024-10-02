package learning_IOC.StereotypeAnnotation.typeOfInjection.TwoContoctor;

import org.springframework.stereotype.Component;

@Component
public interface MessageSERVICE {

    // Imelenet ine method of the inteface
    public  void sendMessage(String msg);
}
