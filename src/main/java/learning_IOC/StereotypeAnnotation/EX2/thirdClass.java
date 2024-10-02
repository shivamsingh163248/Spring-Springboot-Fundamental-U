package learning_IOC.StereotypeAnnotation.EX2;

import org.springframework.stereotype.Component;

@Component("thirdClass")
public class thirdClass implements StudentClasses{
    @Override
    public Integer className() {
        return 3;
    }

    @Override
    public String classTeacherName() {
        return "third class teacher name  ";
    }

    @Override
    public String classCaption() {
        return "this is the third class";
    }
}
