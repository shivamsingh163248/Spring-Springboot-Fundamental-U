package louseCoupling.TightCoupling.AnnoationBasedConfigation.LouseCoupling;

public class TwiterService  implements Message {

    @Override
    public void text(String message) {
        System.out.println(message);
    }
}
