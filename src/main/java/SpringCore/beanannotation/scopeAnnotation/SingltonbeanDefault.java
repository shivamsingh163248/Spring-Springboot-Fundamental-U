package SpringCore.beanannotation.scopeAnnotation;

import org.springframework.stereotype.Component;

@Component
public class SingltonbeanDefault {

    // now learning the in the case of the Singleton bean at the default
    // creating the constructor of the default singltan
    public  SingltonbeanDefault(){
        System.out.println("this is the default singleton value ");
    }

}
