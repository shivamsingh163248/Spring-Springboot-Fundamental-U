package learning_ioc_2.SteryTypeControllerRepositoyService;

import learning_ioc_2.SteryTypeControllerRepositoyService.Reposetory.RepositoryClass;
import learning_ioc_2.SteryTypeControllerRepositoyService.contoler.ControllerClass;
import learning_ioc_2.SteryTypeControllerRepositoyService.service.ServiceClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunApplication {
    public static void main(String[] args) {

        // creating the application contest of the class
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StereoTypeConfig.class) ;
        ControllerClass aClass = applicationContext.getBean(ControllerClass.class) ;
        ServiceClass serviceClass = applicationContext.getBean(ServiceClass.class) ;
        RepositoryClass repositoryClass = applicationContext.getBean(RepositoryClass.class) ;

        // now print all the class


        System.out.println(aClass.ControllerStatement() );
        System.out.println(serviceClass.ServiceString());
        System.out.println(repositoryClass.ReposString());





    }
}
