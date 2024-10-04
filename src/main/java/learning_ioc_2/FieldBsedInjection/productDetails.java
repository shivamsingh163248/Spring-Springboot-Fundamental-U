package learning_ioc_2.FieldBsedInjection;

import org.springframework.stereotype.Component;

@Component
public interface productDetails {

    // creating the all the method of the product details
    public int size();
    public String colour();
    public int prise() ;
    public String sellerName() ;
}
