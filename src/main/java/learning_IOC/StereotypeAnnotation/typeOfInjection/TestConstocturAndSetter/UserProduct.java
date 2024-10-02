package learning_IOC.StereotypeAnnotation.typeOfInjection.TestConstocturAndSetter;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class UserProduct {


    // calling the method to creating the product
//    public void createProduct(){
//        product p1 = new product(100,"Mobile","Electronics");
//        product p2 = new product(200,"Laptop","Electronics");
//        product p3 = new product(300,"Shirt","Clothes");
//        product p4 = new product(400,"Pant","Clothes");
//        product p5 = new product(500,"Shoe","Footwear");
//        product p6 = new product(600,"Sandal","Footwear");
//        product p7 = new product(700,"Bag","Accessories");
//        product p8 = new product(800,"Watch","Accessories");
//        product p9 = new product(900,"Glasses","Accessories");
//        product p10 = new product(1000,"Belt","Accessories");
//    }
    product p1 ;
    Cart cart = new Cart();
    public void addProduct(){
        System.out.println("Product name");
        // creatin the scanner object
        Scanner sc = new Scanner(System.in);
        String productName = sc.nextLine();
        System.out.println("Product price");
        int price = sc.nextInt();
        System.out.println("Product type");
        String productType = sc.nextLine();
         p1 = new product(price,productName,productType);
        cart.addProduct(p1);



    }

    public void removeProduct(){
//        System.out.println("Product name");
//        // creatin the scanner object
//        Scanner sc = new Scanner(System.in);
//        String productName = sc.nextLine();
//        System.out.println("Product price");
//        int price = sc.nextInt();
//        System.out.println("Product type");
//        String productType = sc.nextLine();
//         p1 = new product(price,productName,productType);

        cart.removeProduct(p1);

    }

    public void totalAmount(){
        System.out.println("Total Amount: " + cart.totalAmount());
    }
    public void totalProduct(){
        System.out.println("Total Product: " + cart.totalProduct());
    }




}
