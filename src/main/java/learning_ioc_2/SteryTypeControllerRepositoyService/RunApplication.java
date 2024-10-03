package learning_ioc_2.SteryTypeControllerRepositoyService;

import learning_ioc_2.SteryTypeControllerRepositoyService.contoler.ControllerClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunApplication {
    public static void main(String[] args) {

        // creating the application contest of the class
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StereoTypeConfig.class) ;
        ControllerClass aClass = applicationContext.getBean(ControllerClass.class) ;


    }
}
