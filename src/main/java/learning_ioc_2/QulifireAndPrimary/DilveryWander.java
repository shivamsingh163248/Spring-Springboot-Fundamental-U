package learning_ioc_2.QulifireAndPrimary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DilveryWander {

    // creating the type of the delivery

    Fruit fruit ;
   @Autowired
   public DilveryWander(Fruit fruit){
       this.fruit = fruit ;

    }


    public void TypeDelivered(){
       fruit.type();
       fruit.sweet() ;
    }
}
