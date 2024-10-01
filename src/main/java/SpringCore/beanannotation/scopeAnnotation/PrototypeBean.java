package SpringCore.beanannotation.scopeAnnotation;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {

    // now we will creating the prototype bean of the learning how actually work of the
    // prototype bean

    // creating the constructor of the prototype bean
    public PrototypeBean(){
        // creating the printing
        System.out.println("this is the prototype bean ");
    }

    // creating a method of student tata accpet name moble no and adress

    
}
