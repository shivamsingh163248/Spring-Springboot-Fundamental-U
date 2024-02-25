package louseCoupling.TightCoupling.Dependency;

public class Department {

    // creating the instance of the farmer
    farmer farmer  ;

    //  creating the constructor and creating the object of the farmer
    public  Department (){
        this.farmer = new farmer()  ;

    }

    // now creating the function for the geting the all the detail of the farmer
    public  void getDetailFarmer(){
        farmer.getFarmerDetails() ;
    }

    // this is the example of the tight coupling

}
