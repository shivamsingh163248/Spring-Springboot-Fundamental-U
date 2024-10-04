package learning_ioc_2.beanFeatureWorking;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// creating the multiple class to understand bean working
class student{
    teacher teacher  ;

    student(teacher teacher1){
        this.teacher = teacher1 ;
    }

    // creating the init and destroy method
    public void init(){
        System.out.println("this is the init method ");
    }
    public  void DistMethod(){
        System.out.println("this is the destroy method");
    }

    public void checktest(){
        teacher.about();
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
    @Bean(name = "firstStudent" , initMethod = "init" , destroyMethod = "DistMethod")     // creating
    public student checkStudent(teacher teacher){
        return  new student(teacher) ;
    }

    @Bean(name = "teacherTest" )
    public  teacher teacher(){
        return new teacher() ;
    }



}

public class application {

    public static void main(String[] args) {

        // again creating the main function for the testing and check the all the bean
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(appConfig.class);
        // creating the arrays and the testing the values
        String[] check = applicationContext.getBeanDefinitionNames();
        // creating the for each loop 
        for (String num : check){
            System.out.println(num);
        }

        // now check using the name of the bean
       student teacher = (student) applicationContext.getBean("firstStudent");
        // noe printing the teacher about
        teacher.checktest();


        // using the distort method using the try
    }
    

}
