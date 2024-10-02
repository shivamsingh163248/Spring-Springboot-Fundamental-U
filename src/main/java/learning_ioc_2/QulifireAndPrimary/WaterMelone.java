package learning_ioc_2.QulifireAndPrimary;

import org.springframework.stereotype.Component;

@Component
public class WaterMelone implements Fruit{
    @Override
    public boolean sweet() {
        return false;
    }

    @Override
    public void type() {
      System.out.print("its include is the water");
    }
}
