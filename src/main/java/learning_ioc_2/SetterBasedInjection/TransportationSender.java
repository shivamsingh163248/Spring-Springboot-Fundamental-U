package learning_ioc_2.SetterBasedInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TransportationSender {

    // using the setter method to set the dependency
    private TransactionMode mode ;
    // creating the setter method for the setting the property


    @Autowired
    public void setMode(@Qualifier("NEFT") TransactionMode mode) {
        this.mode = mode;
    }

    // taking the input and the print all the details
    public  void aboutTransactionDetail(int amount){
        mode.transeation(amount);
    }
}
