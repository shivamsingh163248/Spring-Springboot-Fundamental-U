package learning_IOC.StereotypeAnnotation.javaBasedConfigation;

public class client {

    // creating the object of the vehical
    public static void main(String[] args) {
        vehicals vehicals = new car() ;
        vehicals.moving();
        // if i am calling the traveler method then it wll more flexible

        //-------------------------------------------------------------

        traveler traveler = new traveler(vehicals) ;
        // traveler object using the method start journey
        traveler.startJourny();

        //--------------------------------------------------------------

        bike test = new bike() ;
        test.moving();


    }
}
