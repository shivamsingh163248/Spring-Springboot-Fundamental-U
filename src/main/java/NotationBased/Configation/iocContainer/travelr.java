package NotationBased.Configation.iocContainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Travelr")
public class travelr {

    // now creating the constructor
    vehicals vehicals ;
  @Autowired
  public  travelr(@Qualifier("Bike") vehicals vehicals){
        this.vehicals = vehicals ;
    }

    // now after the inserting the value
    public void startJourney(){
        this.vehicals.moving();
    }



}
