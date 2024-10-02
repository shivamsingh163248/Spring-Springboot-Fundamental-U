package learning_ioc_2.annotationBasedConfigation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class School {

    // creating the constructor  of the class
    SchoolClass schoolClass;
    @Autowired
    public School(@Qualifier("firstClass") SchoolClass schoolClass){
        this.schoolClass = schoolClass;

    }

    // now creating the method of the print
    public void print(){
       schoolClass.classDetails();
    }

}
