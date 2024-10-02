package learning_ioc_2.annotationBasedConfigation;

import org.springframework.stereotype.Component;

@Component("SecondClass")
public class SecondClass implements SchoolClass{

    @Override
    public void className() {
        System.out.println("class name is 2");
    }

    @Override
    public void classTeacher() {
        System.out.println("class teacher name itisha singh ");
    }

    @Override
    public void classDetails() {
        System.out.println("this is the 2rd class   all the details ");

    }
}
