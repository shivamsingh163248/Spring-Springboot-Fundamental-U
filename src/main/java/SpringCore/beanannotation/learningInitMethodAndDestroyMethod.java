package SpringCore.beanannotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class school{
    // creating a counstoctur of school class
    private  students students ;
    // creating the counstocter of the school class
    public school(students students){
        this.students = students ;
    }
    // creating the method of print
    public void print(){
        System.out.println("This is the print method of the school class");
        students.print();
    }

    // CREATING  a two method of the init and destroy
    public void init(){
        System.out.println("This is the init method of the school class");
    }
    public void destroy(){
        System.out.println("This is the destroy method of the school class");
    }


}
class students{

    // in the student creating one method
    // creating the method of print
    public void print(){
        System.out.println("This is the print method of the student class");
    }
}
@Configuration
class Appconfigation{
    // creating the bean of the school class
    @Bean(name = "school" , initMethod = "init" , destroyMethod = "destroy")
    public school school(){
        return new school(students());
    }
    // creating the bean of the student class
    @Bean(name = "students")
    public students students(){
        return new students();
    }

}


public class learningInitMethodAndDestroyMethod {
    public static void main(String[] args) {

        // creating the object of the AnnotationConfigApplicationContext
//        ApplicationContext context = new AnnotationConfigApplicationContext(Appconfigation.class);
//        // getting the bean of the school class
//        school school = (SpringCore.beanannotation.school) context.getBean("school");
//        // calling the print method of the school class
//        school.print();
//        // closing the context
//        ((AnnotationConfigApplicationContext) context).close();

        // hear we can see both method are the working


        try (var context = new AnnotationConfigApplicationContext(Appconfigation.class)) {
            // getting the bean of the school class
            school school = (SpringCore.beanannotation.school) context.getBean("school");

            // calling the print method of the school class

            String[]check = context.getBeanDefinitionNames();
            // now printing the check arrys
            for (String s : check) {
                System.out.println(s);
            }
            school.print();
            // closing the context

        }


    }
}
