package NotationBased.Configation.iocContainer;

import org.springframework.stereotype.Component;

@Component("Car")
public class car implements vehicals{

    @Override
    public void moving() {
        System.out.println("car is moving");
    }
}
