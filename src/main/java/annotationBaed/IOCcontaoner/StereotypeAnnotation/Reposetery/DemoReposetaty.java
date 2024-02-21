package annotationBaed.IOCcontaoner.StereotypeAnnotation.Reposetery;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class DemoReposetaty {

    // creating method for the return the string
    public String serviceComponent(){
        return "this is the service component" ;
    }

}

