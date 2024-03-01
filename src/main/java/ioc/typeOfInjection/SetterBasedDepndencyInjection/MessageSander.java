package ioc.typeOfInjection.SetterBasedDepndencyInjection;

public class MessageSander {
    private MessageService messageService;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }



    public void sendMessage(String msg) {
        messageService.sendMessage(msg);
    }
}
