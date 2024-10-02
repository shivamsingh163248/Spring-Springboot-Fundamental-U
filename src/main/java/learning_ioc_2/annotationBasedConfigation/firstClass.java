package learning_ioc_2.annotationBasedConfigation;

import org.springframework.stereotype.Component;

@Component("firstClass")
public class firstClass implements  SchoolClass{

    @Override
    public void className() {
        System.out.println("class name is 1");
    }

    @Override
    public void classTeacher() {
        System.out.println("class teacher name love you ");
    }

    @Override
    public void classDetails() {
        System.out.println("this is the 1rd class   all the details ");

    }

}
