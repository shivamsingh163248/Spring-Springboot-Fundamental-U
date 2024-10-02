package learning_IOC.StereotypeAnnotation.javaBasedConfigation;

public class principle {

    Classes principleCheck ;

    public principle(Classes classes){
        this.principleCheck = classes ;
    }

    // creating the one method for the printing the inpaction value
    public void inspactionValue(){
        this.principleCheck.studentCaption();
        System.out.println("class Name : "+this.principleCheck.className());
        System.out.println("Class Teacher Name :"+this.principleCheck.classTeacher());
    }
}
