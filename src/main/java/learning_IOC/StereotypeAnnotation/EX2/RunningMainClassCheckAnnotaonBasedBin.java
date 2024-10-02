package learning_IOC.StereotypeAnnotation.EX2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunningMainClassCheckAnnotaonBasedBin {

    // creating the main function
    public static void main(String[] args) {

        // creating the object of the IocContainer class
    // creating the application constext object
        //application context is the interface
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class) ;

        // now we can get the bean using the application context
        // now we can get the bean using the application context
        //creating the object of the student class
        principle principle = applicationContext.getBean(principle.class) ;
        principle.checkClass();



        StudentClasses frstClasses = applicationContext.getBean(frstClass.class) ;
       System.out.println(frstClasses.className());

         // creating the object of the director
        Director directorClass = applicationContext.getBean(Director.class) ;
        directorClass.printStudentClasses();
    }
}
