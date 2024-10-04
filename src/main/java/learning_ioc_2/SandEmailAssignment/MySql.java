package learning_ioc_2.SandEmailAssignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MySql implements  DataServer{


    // crating the string arrays and return email


    @Override
    public String[] getmail() {
        return new String[]{"anujsingh@gmail.com" , "anilsingh@gmail.com" , "tushar@gmail.com"};
    }
}
