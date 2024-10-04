package learning_ioc_2.SandEmailAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class client {

    public static void main(String[] args) {

        // creating the application context
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(sandEmailBean.class);
        EmailServer emailServer = applicationContext.getBean(EmailServer.class) ;
        emailServer.getAllEmail();


    }
}
