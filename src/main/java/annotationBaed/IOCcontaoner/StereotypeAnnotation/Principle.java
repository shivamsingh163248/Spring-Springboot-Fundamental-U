package annotationBaed.IOCcontaoner.StereotypeAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("principle")
public class Principle {

    // creating the instance of the student interface
    Student student;
    // creating the constructor of the principle class
    @Autowired
    public Principle( Student student) {
        this.student = student;
    }

    // creating the method for the print the student information
    public void printStudentInfo(){
        System.out.println("Student Roll No : " + student.StudentRollNo());
        System.out.println("Student Name : " + student.StudentName());
        System.out.println("Student Address : " + student.StudentAddress());
        System.out.println("Student Email : " + student.StudentEmail());
        System.out.println("Student Mobile Number : " + student.StudentMobileNumber());
        System.out.println("Student Course : " + student.StudentCourse());
        System.out.println("Student Branch : " + student.StudentBranch());
        System.out.println("Student College Name : " + student.StudentCollegeName());
    }


}
