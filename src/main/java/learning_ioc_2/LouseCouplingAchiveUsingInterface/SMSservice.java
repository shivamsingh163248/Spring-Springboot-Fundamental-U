package learning_ioc_2.LouseCouplingAchiveUsingInterface;

import org.springframework.stereotype.Component;

@Component
public class SMSservice implements ServiceType{
    @Override
    public void sandMessage(String message) {
        System.out.println("this is the sand message using SMS ");
    }
}
