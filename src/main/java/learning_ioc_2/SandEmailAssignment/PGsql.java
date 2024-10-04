package learning_ioc_2.SandEmailAssignment;

import org.springframework.stereotype.Component;

@Component
public class PGsql implements DataServer{
    @Override
    public String[] getmail() {
        return new String[]{"anujsingh@gmail.com" , "anilsingh@gmail.com" , "tushar@gmail.com"};
    }
}
