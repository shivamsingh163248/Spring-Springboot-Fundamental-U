package annotationBaed.IOCcontaoner.StereotypeAnnotation;

import org.springframework.stereotype.Component;

@Component("thirdclass")
public class ThirdClass implements Student {


    @Override
    public int StudentRollNo() {
        return 133;
    }

    @Override
    public String StudentName() {
        return "itisha singh";
    }

    @Override
    public String StudentAddress() {
        return "nadihar rajgarh mirzapur";
    }

    @Override
    public String StudentEmail() {
        return "g@gmail.com";
    }

    @Override
    public String StudentMobileNumber() {
        return "+91 23344545";
    }

    @Override
    public String StudentCourse() {
        return "Bsc";
    }

    @Override
    public String StudentBranch() {
        return "math";
    }

    @Override
    public String StudentCollegeName() {
        return "shps";
    }
}
