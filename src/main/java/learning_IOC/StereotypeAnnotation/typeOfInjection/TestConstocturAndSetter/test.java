package learning_IOC.StereotypeAnnotation.typeOfInjection.TestConstocturAndSetter;

public class test {
    public static void main(String[] args) {

        Cart cart = new Cart();
        product p1 = new product(100, "Mobile", "Electronics");
        product p2 = new product(200, "Laptop", "Electronics");
        product p3 = new product(300, "Shirt", "Clothing");
        product p4 = new product(400, "Shoe", "Clothing");

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);
        cart.addProduct(p4);

        System.out.println("Total Amount: " + cart.totalAmount());
        System.out.println("Total Product: " + cart.totalProduct());

        cart.removeProduct(p4);
        System.out.println("Total Amount: " + cart.totalAmount());
        System.out.println("Total Product: " + cart.totalProduct());


        //.....................................................................

        UserProduct userProduct = new UserProduct();
        userProduct.addProduct();
        userProduct.addProduct();
        userProduct.addProduct();
        userProduct.removeProduct();
        userProduct.totalAmount();
userProduct.totalProduct();






    }
}
