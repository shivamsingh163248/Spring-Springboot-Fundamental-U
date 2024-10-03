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

    @Autowired
    public MessageSander(@Qualifier("SMSservice") ServiceType type){

        this.type = type  ;
    }

    public MessageSander(@Qualifier("SMSservice") ServiceType type ,@Qualifier("Email") ServiceType email){
        this.type = type ;
        this.emailService = email ;

    }

    // creating the method
    public void SandMessage(String Message){
           type.sandMessage(Message);
    }
}
