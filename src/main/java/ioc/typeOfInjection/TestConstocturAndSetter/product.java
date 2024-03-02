package ioc.typeOfInjection.TestConstocturAndSetter;

public class product {
   private int price;
   private String productName;
   private String productType;


    // creating the constructor of the this product
    public product(int price, String productName, String productType) {
        this.price = price;
        this.productName = productName;
        this.productType = productType;
    }
    public product() {

    }



    // creatin the setter of the this product
    public void setPrice(int price) {
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    // creating the getter of the this product
    public int getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductType() {
        return productType;
    }


}
