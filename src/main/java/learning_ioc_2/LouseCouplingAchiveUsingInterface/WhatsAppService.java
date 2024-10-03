package learning_ioc_2.LouseCouplingAchiveUsingInterface;

import org.springframework.stereotype.Component;

@Component
public class WhatsAppService implements ServiceType {



    @Override
    public void sandMessage(String message) {
        System.out.println("now sanding the Message WhatsApp");

    }
}
