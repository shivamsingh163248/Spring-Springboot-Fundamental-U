package learning_ioc_2.annotationBasedConfigation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "learning_ioc_2.annotationBasedConfigation")
public class AppCongigationAnnotation {

    // now automatic configure all the bean
}
