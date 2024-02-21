package annotationBaed.IOCcontaoner.StereotypeAnnotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("secondclass")
@Primary
public class SecondClass implements Student{
    @Override
    public int StudentRollNo() {
        return 122;
    }

    @Override
    public String StudentName() {
        return "shreya singh";
    }

    @Override
    public String StudentAddress() {
        return "varanasi";
    }

    @Override
    public String StudentEmail() {
        return "j@gmail.com";
    }

    @Override
    public String StudentMobileNumber() {
        return "+ 59644444";
    }

    @Override
    public String StudentCourse() {
        return "abc";
    }

    @Override
    public String StudentBranch() {
        return "cse";
    }

    @Override
    public String StudentCollegeName() {
        return "this is the second class student ";
    }
}
