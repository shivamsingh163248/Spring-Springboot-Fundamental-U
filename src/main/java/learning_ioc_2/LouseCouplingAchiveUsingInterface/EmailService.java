package learning_ioc_2.LouseCouplingAchiveUsingInterface;

public class EmailService implements ServiceType{
    @Override
    public void sandMessage(String message) {
      System.out.println("USING THE SAND MESSAGE E-mail Service");
    }
}
