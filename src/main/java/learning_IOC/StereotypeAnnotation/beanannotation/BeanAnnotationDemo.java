package learning_IOC.StereotypeAnnotation.beanannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class student {

     private Address address ;

     // creating the counstocter of the student class
        public student(Address address){
            this.address = address ;
        }

        // creating the one method in t he student class that name is the print

     public void print(){
         System.out.println("This is the print method of the student class");
         address.print();

     }




 }

 class Address{

     // creating the one method od the print
     public void print(){
         System.out.println("This is the print method of the address class");
     }



}

 @Configuration
 class AppConfig{


    @Bean(name = "student")
    public student student(){
        return new student(address());
    }

    @Bean(name = {"address" , "address1"}) // heare we also spefied one or more bean name
    public Address address(){
        return new Address();
    }


}

public class BeanAnnotationDemo {

    public static void main(String[] args) {
        // creating the instance of the Application context
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        student student = (learning_IOC.StereotypeAnnotation.beanannotation.student) applicationContext.getBean("student");
        student.print();
    }
}
