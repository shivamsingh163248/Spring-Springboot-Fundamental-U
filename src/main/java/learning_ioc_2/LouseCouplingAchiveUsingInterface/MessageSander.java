package learning_ioc_2.LouseCouplingAchiveUsingInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSander {

// creating the instace
    ServiceType type ;
    ServiceType emailService;

    // creating the constructor


    public MessageSander(@Qualifier("SMSservice") ServiceType type){

        this.type = type  ;
    }

    @Autowired
    public MessageSander(@Qualifier("") ServiceType type ,@Qualifier("SMSservice") ServiceType email){
        this.type = type ;
        this.emailService = email ;
    }

    // creating the method
    public void SandMessage(String Message){
           type.sandMessage(Message);
           emailService.sandMessage("This is the email service ");
    }
}
