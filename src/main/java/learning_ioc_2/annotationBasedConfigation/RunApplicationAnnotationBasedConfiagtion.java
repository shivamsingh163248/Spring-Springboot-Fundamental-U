package learning_ioc_2.annotationBasedConfigation;

import learning_IOC.StereotypeAnnotation.fristClass;
import learning_ioc_2.version1.JavaBaedConfigation.School;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunApplicationAnnotationBasedConfiagtion {

    public static void main(String[] args) {

        // now creating the application contes
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppCongigationAnnotation.class) ;
        // using the application context and the test case
       firstClass aClass = applicationContext.getBean(firstClass.class) ;
        SecondClass secondClass = applicationContext.getBean(SecondClass.class) ;
        ThirdClass thirdClass = applicationContext.getBean(ThirdClass.class) ;

        // and also check the scool
        School school = applicationContext.getBean(School.class) ;


        // print all the class
        aClass.classDetails();
        secondClass.classDetails();
        thirdClass.classDetails();

        school.

    }
}
