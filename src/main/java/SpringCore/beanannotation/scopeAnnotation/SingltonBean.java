package SpringCore.beanannotation.scopeAnnotation;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingltonBean {

    // learning scope of beans in the java
    // singleton
    // prototype
    // request
    // application
    // websocket

    // the last four scope mentioned , request , session ,application and websocket
    // creating the counstroctur of the scope learning
    public SingltonBean(){
        System.out.println("this is the singlton scope  ");
    }




}
