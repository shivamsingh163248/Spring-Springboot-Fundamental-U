package learning_ioc_2.FieldBsedInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class product {

    // creating inslization of the product

    private final productDetails kichan ;

    @Qualifier("sceneryProduct")
    @Autowired
    private  productDetails stesonery ;

    @Autowired
    public product(@Qualifier("kichaneProduct") productDetails kichan) {
        this.kichan = kichan;
    }


    public void Product( productDetails mechanic){
        this.stesonery = mechanic ;
    }
}
