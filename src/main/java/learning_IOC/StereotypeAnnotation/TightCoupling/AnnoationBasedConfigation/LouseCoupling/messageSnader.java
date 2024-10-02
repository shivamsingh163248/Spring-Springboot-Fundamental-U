package learning_IOC.StereotypeAnnotation.TightCoupling.AnnoationBasedConfigation.LouseCoupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class messageSnader {

    // creating the instace
    Message message ;

    // creating the constructor
    @Autowired
    public messageSnader (Message message){
        this.message = message ;
    }

    // creating the method
    public void Sander(String messages){
        message.text(messages);
    }
}
