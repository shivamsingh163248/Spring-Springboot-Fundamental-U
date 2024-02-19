package componentBasedConfigation.IocContainer.EX2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("principle")
public class principle {

    /// creating the constructor of the principle class

    // creating the instance of the StudentClasses interface
    StudentClasses studentClasses ;

@Autowired
public principle(@Qualifier("SeecondClass") StudentClasses studentClasses) {
        this.studentClasses = studentClasses;
    }

    // creating the method to get the class name
    public void checkClass() {
        System.out.println("class name is : " + studentClasses.className());
        System.out.println("class teacher name is : " + studentClasses.classTeacherName());
        System.out.println("class caption is : " + studentClasses.classCaption());

    }

}
