package iocContaner.javaBasedConfigation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
 public class AppConfig {

    // creating the class of the different method

    @Bean
    public vehicals car(){
        return new car() ;
    }

    // creating the for the bike
    @Bean
    public vehicals bike(){
        return new bike() ;
    }

    @Bean
    public vehicals cycle(){
        return  new cycle();
    }

    // again creating the bead method the traveler



    // when we are creating the object of the travel the its have the parameter of the vehical instance
   @Bean
   public traveler traveler(){
        return new traveler(car()) ;
    }
}
