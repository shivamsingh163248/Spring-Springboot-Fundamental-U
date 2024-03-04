package ioc.typeOfInjection.TestConstocturAndSetter;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Cart {

    // creating the cart
  private  int totalAmount ;
  private  int totalProduct ;
    ArrayList<product>products ; // creating the array list of the product


    // creating the constructor of the this cart one is default and another is parameterized
    public Cart() {

        products = new ArrayList<product>();
    }

    // creating the total amount function  to calculate the total amount of the product
    public int totalAmount(){
        totalAmount = 0;
        for (product p : products){
            totalAmount += p.getPrice();
        }
        return totalAmount;
    }

    // creating the total product function to calculate the total product
    public int totalProduct(){
        totalProduct = 0;
        for (product p : products){
            totalProduct += 1;
        }
        return totalProduct;
    }

    // creating the function add product to add the product in the cart
    public void addProduct(product p){

        products.add(p);
    }

    // creating the function remove product to remove the product from the cart
    public void removeProduct(product p){
        products.remove(p);
    }







}
