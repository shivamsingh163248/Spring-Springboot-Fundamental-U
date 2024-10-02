package learning_IOC.StereotypeAnnotation.EX2;

import org.springframework.stereotype.Component;

@Component("SeecondClass")
public class secondClass  implements  StudentClasses{

    // implementation all the method
    @Override
    public Integer className() {
        return 2;
    }

    @Override
    public String classTeacherName() {
        return "itisha singh  ";
    }

    @Override
    public String classCaption() {
        return "this is the second class";
    }
}
