package learning_ioc_2.QulifireAndPrimary;

import org.springframework.stereotype.Component;

@Component("Mango")
public class Mango implements  Fruit{
    @Override
    public boolean sweet() {
        return true;
    }

    @Override
    public void type() {
       System.out.println("this is the king of the fruit");
        System.out.println("Mango are the delivered");
    }
}
