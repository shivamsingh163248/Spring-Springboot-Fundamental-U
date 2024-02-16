package iocContaner.javaBasedConfigation;

public class traveler {

    // creating the traveler constructor
    vehicals vehicals ;
    public traveler(vehicals vehicals1){
        // set the value of the Vehical object
        this.vehicals = vehicals1 ;
    }

    // now creating the method of the startJourny
    public void startJourny() {
        this.vehicals.moving();
    }
}
