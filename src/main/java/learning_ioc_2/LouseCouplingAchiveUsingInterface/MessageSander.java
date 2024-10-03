package learning_ioc_2.LouseCouplingAchiveUsingInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSander {

// creating the instace
    ServiceType whatsapp ;
    ServiceType emailService;

    // creating the constructor


    public MessageSander(@Qualifier("SMSservice") ServiceType type){

       this.whatsapp = type ;
    }

    @Autowired
    public MessageSander(@Qualifier("whatsAppService") ServiceType whatsapp   ,  ServiceType emailService){
     this.whatsapp = whatsapp ;
     this.emailService = emailService ;
    }

    // creating the method
    public void SandMessage(String Message){
          whatsapp.sandMessage(Message);
          emailService.sandMessage("this is the email message");

    }
}
