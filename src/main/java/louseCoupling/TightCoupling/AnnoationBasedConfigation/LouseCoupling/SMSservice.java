package louseCoupling.TightCoupling.AnnoationBasedConfigation.LouseCoupling;

import org.springframework.stereotype.Component;

@Component
public class SMSservice implements Message {

    @Override
    public void text(String message) {
        System.out.println(message);
    }
}


