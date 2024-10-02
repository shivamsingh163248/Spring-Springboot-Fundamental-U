package learning_IOC.StereotypeAnnotation.TightCoupling.AnnoationBasedConfigation.LouseCoupling;

import org.springframework.stereotype.Component;

@Component
public class TwiterService  implements Message {

    @Override
    public void text(String message) {
        System.out.println(message);
    }
}
