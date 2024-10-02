package learning_ioc_2.version1.JavaBaedConfigation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        primaryClass pri  = applicationContext.getBean(primaryClass.class);
        pri.classFeature();

        SecondaryClass check = applicationContext.getBean(SecondaryClass.class) ;
        check.classDetails();
        check.classFeature();
         School testSchool = applicationContext.getBean(School.class) ;


    }

}
