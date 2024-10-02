package learning_IOC.StereotypeAnnotation.TightCoupling.javabasedcofigation.LouseCoupling;

public class TwiterService  implements Message {

    @Override
    public void text(String message) {
        System.out.println(message);
    }
}
