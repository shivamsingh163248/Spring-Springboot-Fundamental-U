package learning_IOC.StereotypeAnnotation.RameshFadatere;

public class travelaer {

        Car car = null ;

        // nw creating the constoctur

 public  travelaer(){
     this.car = new Car()  ;
    }

   public void startJourny(){
     this.car.move();
   }
}
