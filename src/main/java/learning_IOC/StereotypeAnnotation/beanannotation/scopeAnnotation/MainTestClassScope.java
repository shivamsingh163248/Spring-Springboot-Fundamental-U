package learning_IOC.StereotypeAnnotation.beanannotation.scopeAnnotation;

    import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTestClassScope {

    // creatng the main method
    public static void main(String[] args) {

        // creating the try and creating the application context
      ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class) ;

        // now using the getbean method to getting the class in the bean
        SingltonBean singltonBean = applicationContext.getBean(SingltonBean.class) ;
        // now creating the instace of the singeton bean
  SingltonBean singltonBean1 = applicationContext.getBean(SingltonBean.class) ;
       SingltonBean singltonBean2 = applicationContext.getBean(SingltonBean.class) ;

       // now testing the prototype bean
//      beanDefault aDefault1 = applicationContext.getBean(beanDefault.class) ;
//     beanDefault aDefault2 = applicationContext.getBean(beanDefault.class) ;
//       beanDefault aDefault3 = applicationContext.getBean(beanDefault.class) ;

        // now creating the prototype

        // now printing the hasconde of each objet of the application context
        System.out.println(singltonBean.hashCode());
        System.out.println(singltonBean1.hashCode());
        System.out.println(singltonBean2.hashCode());

        // now you can all the hashcode  are the same in singleton



        PrototypeBean prototypeBean1 = applicationContext.getBean(PrototypeBean.class) ;
        PrototypeBean prototypeBean2 = applicationContext.getBean(PrototypeBean.class) ;
        PrototypeBean prototypeBean3 = applicationContext.getBean(PrototypeBean.class) ;

        System.out.println(prototypeBean1.hashCode());
        System.out.println(prototypeBean2.hashCode());
        System.out.println(prototypeBean3.hashCode());









    }
}
