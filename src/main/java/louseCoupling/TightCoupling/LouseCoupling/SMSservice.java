package louseCoupling.TightCoupling.LouseCoupling;

public class SMSservice implements  Message {

    @Override
    public void text(String message) {
        System.out.println(message);
    }
}


