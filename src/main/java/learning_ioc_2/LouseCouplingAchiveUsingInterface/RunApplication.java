package learning_ioc_2.LouseCouplingAchiveUsingInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunApplication {

    public static void main(String[] args) {

        // creating the application context
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfigLouseCoupling.class) ;
        // creating the object without the new key world
        EmailService emailService = applicationContext.getBean(EmailService.class) ;
        String message = "good morning have a nyc day itisha " ;
        // emailService.sandMessage(message);
        MessageSander messageSander = applicationContext.getBean(MessageSander.class) ;
        messageSander.SandMessage(message);
    }

}
