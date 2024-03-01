package ioc.typeOfInjection.SetterBaed;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SetterBasedDependencyInjectionTest {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageService messageService = applicationContext.getBean(MessageService.class);
        messageService.sendMessage("Hi, good morning!");


    }
}
