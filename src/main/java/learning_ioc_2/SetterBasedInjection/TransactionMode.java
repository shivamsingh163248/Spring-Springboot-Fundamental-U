package learning_ioc_2.SetterBasedInjection;

import org.springframework.stereotype.Component;

@Component
public interface TransactionMode {

    public void transeation(int amount) ;

}
