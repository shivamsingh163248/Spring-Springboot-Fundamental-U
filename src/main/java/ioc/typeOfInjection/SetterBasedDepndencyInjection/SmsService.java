package ioc.typeOfInjection.SetterBasedDepndencyInjection;

public class SmsService  implements MessageService{
    @Override
    public void sendMessage(String msg) {
        System.out.println("SMS: " + msg);
    }
}
