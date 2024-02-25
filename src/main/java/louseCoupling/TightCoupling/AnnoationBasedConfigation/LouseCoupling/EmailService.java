package louseCoupling.TightCoupling.AnnoationBasedConfigation.LouseCoupling;


// implement all the message interface
public class EmailService implements Message {

    @Override
    public void text(String message) {
        System.out.println(message);
    }
}
