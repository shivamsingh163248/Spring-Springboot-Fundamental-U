package louseCoupling.TightCoupling.TightCoupling;

import org.springframework.beans.factory.config.ObjectFactoryCreatingFactoryBean;

public class client {

    // creating the the main function
    public static void main(String[] args) {

        // creating the object of the massage sander

        String message = "Hello charm !!  this is the message " ;
        // creating the object of the email
        EmailService emailService = new EmailService() ;
        MassageSender massageSender = new MassageSender(emailService) ;

        SMSservice smSservice = new SMSservice() ;
        MassageSender massageSenderSms = new MassageSender(smSservice) ;

        massageSender.sander(message);
        massageSender.sander(message);

    }
}
