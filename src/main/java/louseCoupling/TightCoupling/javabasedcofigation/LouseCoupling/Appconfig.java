package louseCoupling.TightCoupling.javabasedcofigation.LouseCoupling;

import louseCoupling.TightCoupling.TightCoupling.MassageSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;

@Configuration
public class Appconfig {

    // creating the method and the return the method using the @bean annotation
    @Bean
    public Message Email(){
        return new EmailService() ;
    }

    @Bean
    public Message SmsMessage(){
        return new SMSservice() ;
    }

    @Bean
    public Message twiterMessage(){

        return new TwiterService() ;
    }

    @Bean
    public messageSnader massagessander(){
        return new messageSnader(Email()) ;
    }


}
