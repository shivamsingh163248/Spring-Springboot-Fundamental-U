package iocContainer.javaBasedConfigation;

public class DirectiorNoraml_IOC {

    // creating the main function
    public static void main(String[] args) {

        // creating the object of the classes and calls different
        Classes fristclass = new classThird() ;
        fristclass.studentCaption();
        System.out.println(fristclass.classTeacher());
        System.out.println(fristclass.className());

    }
}
