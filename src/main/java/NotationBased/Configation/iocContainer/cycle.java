package NotationBased.Configation.iocContainer;


import org.springframework.stereotype.Component;

@Component("Cycle")
public class cycle implements vehicals{
    @Override
    public void moving() {
        System.out.println("cycle is moving");
    }
}
