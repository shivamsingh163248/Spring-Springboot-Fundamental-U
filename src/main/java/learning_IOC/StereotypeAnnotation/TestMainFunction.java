package learning_IOC.StereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMainFunction {

    public static void main(String[] args) {

        // creating the object of the student interface
        // creating the appconstexa
        ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class) ;
        Principle principle = context.getBean(Principle.class) ;
        fristClass aClass = context.getBean(fristClass.class) ;
        System.out.println(aClass.StudentAddress());
        principle.printStudentInfo();
    }

}
