package learning_ioc_2.FieldBsedInjection;

import org.springframework.stereotype.Component;

@Component
public class SceneryProduct implements  productDetails{

    // creating the constructor
    private int size ;
    private String colour ;
    private int prise ;
    private String sellerName ;

    public SceneryProduct(int size, String colour, int prise, String sellerName) {
        this.size = size;
        this.colour = colour;
        this.prise = prise;
        this.sellerName = sellerName;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String colour() {
        return colour;
    }

    @Override
    public int prise() {
        return prise;
    }

    @Override
    public String sellerName() {
        return sellerName;
    }
}
