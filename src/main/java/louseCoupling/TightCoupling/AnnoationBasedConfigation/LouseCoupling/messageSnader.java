package louseCoupling.TightCoupling.AnnoationBasedConfigation.LouseCoupling;

public class messageSnader {

    // creating the instace
    Message message ;

    // creating the constructor
    public messageSnader (Message message){
        this.message = message ;
    }

    // creating the method
    public void Sander(String messages){
        message.text(messages);
    }
}
