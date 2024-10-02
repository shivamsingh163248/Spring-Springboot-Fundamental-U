package learning_IOC.StereotypeAnnotation.TightCoupling.AnnoationBasedConfigation.LouseCoupling;

import org.springframework.stereotype.Component;

@Component
public interface Message {

    // creating the method of the text
    public void text( String message) ;
}
