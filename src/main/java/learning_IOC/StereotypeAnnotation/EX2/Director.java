package learning_IOC.StereotypeAnnotation.EX2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("director")
public class Director {
    private StudentClasses studentClasses;

    // hear using the inject the dependency using the @qualifire annotation
@Autowired
    public Director(StudentClasses studentClasses) {
        this.studentClasses = studentClasses;
    }


   public void printStudentClasses() {
        System.out.println("Class Name: " + studentClasses.className());
        System.out.println("Class Teacher Name: " + studentClasses.classTeacherName());
        System.out.println("Class Caption: " + studentClasses.classCaption());
    }

}
