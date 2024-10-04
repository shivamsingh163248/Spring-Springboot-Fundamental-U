package learning_ioc_2.SetterBasedInjection;

import org.springframework.stereotype.Component;

@Component
public class NEFT implements TransactionMode{
    @Override
    public void transeation(int amount) {
        printMode(amount);
    }

    // creating the function for the print  all the transaction
    private void printMode(int amount){
        System.out.println("amount : "+amount);
        System.out.println("A/C : XXXXXXXXXX454" );
        System.out.println("Mode : NEFT");

    }
}
