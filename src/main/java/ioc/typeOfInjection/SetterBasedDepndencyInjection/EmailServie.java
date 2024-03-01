package ioc.typeOfInjection.SetterBasedDepndencyInjection;

public class EmailServie implements  MessageService{
    @Override
    public void sendMessage(String msg) {
        System.out.println("Email: " + msg);
    }
}
