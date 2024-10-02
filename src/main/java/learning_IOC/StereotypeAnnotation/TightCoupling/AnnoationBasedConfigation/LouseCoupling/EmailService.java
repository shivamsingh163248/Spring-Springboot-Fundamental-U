package learning_IOC.StereotypeAnnotation.TightCoupling.AnnoationBasedConfigation.LouseCoupling;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// implement all the message interface
@Component
@Primary
public class EmailService implements Message {

    @Override
    public void text(String message) {
        System.out.println(message);
    }
}
