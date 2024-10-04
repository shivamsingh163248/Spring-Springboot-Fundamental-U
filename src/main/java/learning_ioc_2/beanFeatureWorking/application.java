package learning_ioc_2.beanFeatureWorking;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// creating the multiple class to understand bean working
class student{
    teacher teacher  ;

    student(teacher teacher1){
        this.teacher = teacher1 ;
    }


}
class teacher{

    // creating the method of the teacher
    public void about(){
        System.out.println("this is the teacher");
    }

}

@Configuration
class  appConfig {

    // creating to configure
    @Bean
    public student checkStudent(teacher teacher){
        return  new student(teacher) ;
    }

    @Bean
    public  teacher teacher(){
        return new teacher() ;
    }



}

public class application {
}
