package learning_IOC.StereotypeAnnotation.javaBasedConfigation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// learning the java based configuration
@Configuration
public class AppConfig {


    @Bean
    public Classes FistClass() {

        return new FistClass();
    }

    @Bean
    public Classes SecondClass() {
        return new classSecond();
    }

    @Bean
    public Classes ThirdClass() {
        return new classThird();
    }


}
