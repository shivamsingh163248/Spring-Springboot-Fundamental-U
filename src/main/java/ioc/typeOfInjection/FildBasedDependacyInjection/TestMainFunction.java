package ioc.typeOfInjection.FildBasedDependacyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMainFunction {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Appconig.class);

        MessageSander messageSander = applicationContext.getBean(MessageSander.class);
        messageSander.sandMessage("Hello World");





    }
}
