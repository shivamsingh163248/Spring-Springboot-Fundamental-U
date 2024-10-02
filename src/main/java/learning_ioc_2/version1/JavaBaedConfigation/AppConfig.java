package learning_ioc_2.version1.JavaBaedConfigation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // creating the bean of the all the class
    @Bean
    public schoolClass primary(){
        return new primaryClass() ;
    }

    @Bean
    public schoolClass seSchoolClass(){
        return new SecondaryClass() ;
    }

    // creating the bean
    @Bean
    public School school(){
        return new School(primary()) ;
    }
}
