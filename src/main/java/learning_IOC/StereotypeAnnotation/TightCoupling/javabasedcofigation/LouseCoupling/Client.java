package learning_IOC.StereotypeAnnotation.TightCoupling.javabasedcofigation.LouseCoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    // now creatig the main method and the test the louse copuling

    public static void main(String[] args) {

        // creating the object of the message

        String mag = " hello !! good morning " ;

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Appconfig.class) ;

      messageSnader massage = applicationContext.getBean(messageSnader.class) ;
      massage.Sander(mag);



    }
}
