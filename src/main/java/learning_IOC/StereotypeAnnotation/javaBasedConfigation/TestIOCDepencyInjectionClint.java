package learning_IOC.StereotypeAnnotation.javaBasedConfigation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestIOCDepencyInjectionClint {

    public static void main(String[] args) {



    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class) ;

    // creating spring IOC container
    // read the configuration class
    // creat and managed the spring beans

    // retrieve spring beans form the spring IOC container
     car car =    applicationContext.getBean(car.class) ;
     car.moving();

     // again calling the ioc container for the beans
        vehicals  vehicals = applicationContext.getBean(bike.class) ;
        vehicals.moving();

        // creating and the calling the one more method
        cycle cycles = applicationContext.getBean(cycle.class);
        cycles.moving();
}
}
