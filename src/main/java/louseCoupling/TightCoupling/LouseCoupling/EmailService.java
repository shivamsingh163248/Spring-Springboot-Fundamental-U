package louseCoupling.TightCoupling.LouseCoupling;


// implement all the message interface
public class EmailService implements Message {

    @Override
    public void text(String message) {
        System.out.println(message);
    }
}
