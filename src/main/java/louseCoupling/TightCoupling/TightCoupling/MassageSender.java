package louseCoupling.TightCoupling.TightCoupling;

import louseCoupling.TightCoupling.javabasedcofigation.LouseCoupling.Message;

public class MassageSender {

    // creating the instance if the email service
    EmailService emailService ;
    SMSservice smSservice ;

    // creating the object through the constructor
    public MassageSender(EmailService email){

        this.emailService = email;
    }
    public MassageSender(SMSservice smSservic){

        this.smSservice = smSservic;
    }

    public MassageSender(Message message) {
    }

    // creating the method to take input as the string creating the method name is the
    // the sander
    public void sander( String message){

        this.emailService.messageTxt(message);
    }


}
