package learning_IOC.StereotypeAnnotation.javaBasedConfigation;

public class FistClass implements Classes {


    @Override
    public String classTeacher() {

        return "sakshiMishra";
    }

    @Override
    public int className() {

        return 1;
    }

    @Override
    public void studentCaption() {
        System.out.println("this is the class fist");
    }
}
