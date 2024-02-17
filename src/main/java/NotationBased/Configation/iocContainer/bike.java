package NotationBased.Configation.iocContainer;

import org.springframework.stereotype.Component;

@Component("Bike")
public class bike implements vehicals{

    @Override
    public void moving() {
        System.out.println("bike is moving");
    }
}
