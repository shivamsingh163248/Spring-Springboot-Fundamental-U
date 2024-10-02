package learning_IOC.StereotypeAnnotation.typeOfInjection.TwoContoctor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testing {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MeaagaeSander meaagaeSander = context.getBean(MeaagaeSander.class);
        meaagaeSander.processMessage("Hi, Pankaj");
    }
}
