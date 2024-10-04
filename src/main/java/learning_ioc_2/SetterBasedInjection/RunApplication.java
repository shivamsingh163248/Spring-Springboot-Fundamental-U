package learning_ioc_2.SetterBasedInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunApplication {

    // now creating the application context
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class) ;
        //creating the get bean method for the using the object without the new keyWorld
        TransportationSender sender = applicationContext.getBean(TransportationSender.class) ;
        sender.aboutTransactionDetail(345);
    }
}
