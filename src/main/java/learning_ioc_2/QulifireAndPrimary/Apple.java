package learning_ioc_2.QulifireAndPrimary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Apple")
@Primary
public class Apple implements Fruit{
    @Override
    public boolean sweet() {
        return true;
    }

    @Override
    public void type() {
  System.out.println("this is the kasmiri apple");

    }
}
