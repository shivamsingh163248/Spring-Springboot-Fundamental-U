package learning_IOC.StereotypeAnnotation.TightCoupling.Dependency;

import javax.print.DocFlavor;
import javax.sound.midi.VoiceStatus;

public class farmer {

    private String name;
    private String Address ;
    private String phone ;



    // creating the the method for the return all the string

    //  creating the constructor for the formar class
    public farmer(String name , String address , String phone){
        this.name = name ;
        this.Address = address ;
        this.phone = phone ;
    }
    public farmer(){

    }

    public String getFarmerDetails(){
        return "Address=" + Address + ", Name=" + name + ", Phone=" + phone ;
    }
}
