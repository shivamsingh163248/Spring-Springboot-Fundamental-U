package SpringCore.beanannotation.scopeAnnotation;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class beanDefault {

    // now learning the in the case of the Singleton bean at the default
    // creating the constructor of the default singltan
    public beanDefault(){
        System.out.println("this is the default  value ");
    }

}
