package learning_IOC.StereotypeAnnotation.typeOfInjection.Contoctor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestingCounstourBasedDepnedInjection {

    // creating the main class
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppCongi.class);
        MessageSnder messageSnder = applicationContext.getBean(MessageSnder.class);
        messageSnder.sendMessage("Hello, this is the message");
    }
}
