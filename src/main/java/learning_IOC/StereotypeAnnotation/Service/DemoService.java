package learning_IOC.StereotypeAnnotation.Service;


import org.springframework.stereotype.Service;

@Service
public class DemoService {

    // creating the method of the service annotation for the return string
    public String serviceComponent(){
        return "this is the service component" ;
    }
}
