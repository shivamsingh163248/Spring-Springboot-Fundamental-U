package learning_ioc_2.LouseCouplingAchiveUsingInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSander {

// creating the instace
    ServiceType type ;
    ServiceType smsService ;

    // creating the constructor

    @Autowired
    public MessageSander(@Qualifier("SMSservice") ServiceType type){

        this.type = type  ;
    }

    public MessageSander(@Qualifier("SMSservice") ServiceType type , ServiceType smsService){
        this.type = type ;
        this.smsService = smsService ;

    }

    // creating the method
    public void SandMessage(String Message){
           type.sandMessage(Message);
    }
}
