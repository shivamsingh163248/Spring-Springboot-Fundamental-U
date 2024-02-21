package annotationBaed.IOCcontaoner.StereotypeAnnotation;

import annotationBaed.IOCcontaoner.StereotypeAnnotation.Contoler.DemoContoler;
import annotationBaed.IOCcontaoner.StereotypeAnnotation.Reposetery.DemoReposetaty;
import annotationBaed.IOCcontaoner.StereotypeAnnotation.Service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSterotypeAnnotaion {

    // crating the main method
    public static void main(String[] args) {

        // creating the application context
        ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class) ;
        // creating the object demo repository
        DemoContoler demoContoler = context.getBean(DemoContoler.class) ;
        // creating the object of the demo service
        DemoService demoService = context.getBean(DemoService.class);
        // creating the object of the demo contoler
        DemoReposetaty demoReposetaty = context.getBean(DemoReposetaty.class) ;

        // calling the all the object function
        System.out.println(demoContoler.contolercomponent());
        System.out.println(demoService.serviceComponent());
        System.out.println(demoReposetaty.serviceComponent());


    }
}
