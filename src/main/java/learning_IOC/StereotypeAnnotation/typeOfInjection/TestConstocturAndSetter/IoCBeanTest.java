package learning_IOC.StereotypeAnnotation.typeOfInjection.TestConstocturAndSetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IoCBeanTest {
    public static void main(String[] args) {
        // implementation of the application context
         ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
            // get the bean from the application context
        UserProduct product = applicationContext.getBean(UserProduct.class);
        product.addProduct();
        product.totalAmount();
        product.totalProduct();

    }


}
