package learning_IOC.StereotypeAnnotation.javaBasedConfigation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBeanUsingJavaBasedConfigation {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class) ;

        // now application context is the direct return the value
        classSecond second = applicationContext.getBean(classSecond.class) ;
        System.out.println(second.className());
        System.out.println(second.classTeacher());
        second.studentCaption();
    }

}
