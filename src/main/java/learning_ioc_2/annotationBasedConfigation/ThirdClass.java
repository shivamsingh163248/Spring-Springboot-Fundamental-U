package learning_ioc_2.annotationBasedConfigation;

public class ThirdClass implements SchoolClass {


    @Override
    public void className() {
        System.out.println("class name is 3");
    }

    @Override
    public void classTeacher() {
         System.out.println("class teacher name shivam singh ");
    }

    @Override
    public void classDetails() {
        System.out.println("this is the 3rd class   all the details ");

    }
}
