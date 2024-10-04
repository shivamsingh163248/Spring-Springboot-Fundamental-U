package learning_ioc_2.SetterBasedInjection;

import org.springframework.stereotype.Component;

@Component
public class NETBanking implements TransactionMode {



        @Override
        public void transeation(int amount) {
            printMode(amount);
        }

        // creating the function for the print  all the transaction
        private void printMode(int amount) {
            System.out.print("amount : " + amount);
            System.out.print("A/C : XXXXXXXXXX454");
            System.out.print("Mode : NETBanking");

        }
    }

