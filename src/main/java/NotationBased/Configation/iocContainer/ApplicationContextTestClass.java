package NotationBased.Configation.iocContainer;

import Spring6Springboot3.RameshFadatere.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ObjectInputFilter;

public class ApplicationContextTestClass {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class) ;
        // testing the method
        car Car = applicationContext.getBean(car.class) ;
        Car.moving();
        bike bike = applicationContext.getBean(bike.class) ;
        bike.moving();

        travelr travelr = applicationContext.getBean(NotationBased.Configation.iocContainer.travelr.class) ;
        travelr.startJourney();
    }

}
