package learning_ioc_2.QulifireAndPrimary;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunApplication {

    public static void main(String[] args) {
        // creating the application context and the using annotation configuration
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DeliveryRecontribute.class) ;

        Mango mango = applicationContext.getBean(Mango.class) ;
        Apple apple = applicationContext.getBean(Apple.class)  ;
        WaterMelone waterMelone = applicationContext.getBean(WaterMelone.class) ;

        DilveryWander dilveryWander = applicationContext.getBean(DilveryWander.class);

        // now print all the details
        mango.sweet()  ;
        mango.type();
        apple.sweet() ;
        apple.type();
        waterMelone.type();
        waterMelone.sweet() ;

        dilveryWander.TypeDelivered();

    }
    // testing all the class  and the uses
}
