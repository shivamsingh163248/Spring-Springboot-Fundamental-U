package learning_ioc_2.LouseCouplingAchiveUsingInterface;

import org.springframework.stereotype.Component;

@Component
public interface ServiceType {

    // creating the function
    public void sandMessage(String message) ;
    // this is the function implement

}
