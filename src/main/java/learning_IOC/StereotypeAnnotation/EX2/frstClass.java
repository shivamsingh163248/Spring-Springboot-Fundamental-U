package learning_IOC.StereotypeAnnotation.EX2;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("frstClass")
@Primary  // this is the used the primary annotation in the class using for the primary bean
class frstClass implements StudentClasses{
    @Override
    public Integer className() {
        return 1;
    }

    @Override
    public String classTeacherName() {
        return "Shivam singh ";
    }

    @Override
    public String classCaption() {

        return "this is the first class";
    }
}