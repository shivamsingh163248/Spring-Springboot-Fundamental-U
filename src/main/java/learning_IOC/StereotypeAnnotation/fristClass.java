package learning_IOC.StereotypeAnnotation;

import org.springframework.stereotype.Component;

@Component("fristClass")
public class fristClass implements Student{

    @Override
    public int StudentRollNo() {
        return 111;
    }

    @Override
    public String StudentName() {
        return "shivam singh";
    }

    @Override
    public String StudentAddress() {
        return "nadihar rajgarh mirzapur";
    }

    @Override
    public String StudentEmail() {
        return "s@gmail.com";


    }

    @Override
    public String StudentMobileNumber() {
        return "+91 23344545";
    }

    @Override
    public String StudentCourse() {
        return "Dsa";
    }

    @Override
    public String StudentBranch() {
        return "cse";
    }

    @Override
    public String StudentCollegeName() {
        return "shps";
    }
}
