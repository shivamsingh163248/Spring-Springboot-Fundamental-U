package learning_ioc_2.LouseCouplingAchiveUsingInterface;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements ServiceType{
    @Override
    public void sandMessage(String message) {
      System.out.println("USING THE SAND MESSAGE E-mail Service");
      System.out.println(message);
    }
}
