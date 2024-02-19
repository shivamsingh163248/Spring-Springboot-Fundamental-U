package componentBasedConfigation.IocContainer.EX2;

import org.springframework.stereotype.Component;

@Component
public class Director {
    private StudentClasses studentClasses;

    public Director(StudentClasses studentClasses) {
        this.studentClasses = studentClasses;
    }

    public void printStudentClasses() {
        System.out.println("Class Name: " + studentClasses.className());
        System.out.println("Class Teacher Name: " + studentClasses.classTeacherName());
        System.out.println("Class Caption: " + studentClasses.classCaption());
    }

}
