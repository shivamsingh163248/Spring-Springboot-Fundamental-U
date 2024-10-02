package learning_IOC.StereotypeAnnotation.TightCoupling.AnnoationBasedConfigation.LouseCoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    // now creatig the main method and the test the louse copuling

    public static void main(String[] args) {

        // creating the object of the message

        String mag = " hello !! good morning " ;

        // creating the application context
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppconfigAnnotation.class) ;
        messageSnader  snader = applicationContext.getBean(messageSnader.class);
        snader.Sander(mag);

    }
}
