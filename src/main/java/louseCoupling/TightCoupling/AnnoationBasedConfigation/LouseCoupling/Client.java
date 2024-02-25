package louseCoupling.TightCoupling.AnnoationBasedConfigation.LouseCoupling;

public class Client {

    // now creatig the main method and the test the louse copuling

    public static void main(String[] args) {

        // creating the object of the message
        Message message = new EmailService() ;
        // calling the message sander for the sanding the message
        messageSnader snaderss = new messageSnader(message) ;
        // now calling the method
        String mag = " hello !! good morning " ;
        snaderss.Sander(mag);
    }
}
