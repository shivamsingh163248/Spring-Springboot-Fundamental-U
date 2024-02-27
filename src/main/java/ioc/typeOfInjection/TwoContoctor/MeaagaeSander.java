package ioc.typeOfInjection.TwoContoctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MeaagaeSander {
    private MessageSERVICE messageSERVICE;
    private MessageSERVICE smsService ;

    public MeaagaeSander(MessageSERVICE messageSERVICE) {
        this.messageSERVICE = messageSERVICE;
    }
    @Autowired
    public MeaagaeSander(MessageSERVICE messageSERVICE , MessageSERVICE smsService) {
        this.messageSERVICE = messageSERVICE;
        this.smsService = smsService;
    }

    public void processMessage(String msg) {
        messageSERVICE.sendMessage(msg);
        smsService.sendMessage(msg);
    }
}
