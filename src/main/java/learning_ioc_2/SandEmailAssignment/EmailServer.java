package learning_ioc_2.SandEmailAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailServer {

    // creating instance of data server
    DataServer dataServer ;

    // creating the constructor
    @Autowired
    EmailServer(DataServer dataServer){
        this.dataServer = dataServer ;
    }

    // now creating function for the getting all the email
    public void getAllEmail(){

        // creating loop for print all the email
        for (String string : dataServer.getmail()){
            System.out.println(string);
        }
    }
}
