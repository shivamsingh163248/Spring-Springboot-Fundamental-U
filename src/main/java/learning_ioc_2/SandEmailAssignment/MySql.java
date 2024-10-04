package learning_ioc_2.SandEmailAssignment;

public class MySql implements  DataServer{


    // crating the string arrays and return email


    @Override
    public String[] getmail() {
        return new String[]{"anujsingh@gmail.com" , "anilsingh@gmail.com" , "tushar@gmail.com"};
    }
}
