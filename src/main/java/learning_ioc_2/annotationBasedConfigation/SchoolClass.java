package learning_ioc_2.annotationBasedConfigation;

import org.springframework.stereotype.Component;

@Component("SchoolClass")
public interface SchoolClass {

    // creating the feature
    public void className() ;
    public void classTeacher() ;
    public void  classDetails() ;
}
