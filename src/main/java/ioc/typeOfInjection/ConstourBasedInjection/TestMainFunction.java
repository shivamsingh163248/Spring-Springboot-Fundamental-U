package ioc.typeOfInjection.ConstourBasedInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMainFunction {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
       Demo demo = applicationContext.getBean(Demo.class);
        demo.show();



    }
}
