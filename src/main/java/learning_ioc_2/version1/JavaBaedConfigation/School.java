package learning_ioc_2.version1.JavaBaedConfigation;

public class School {

    // creating the counteract
    public School(schoolClass school){
         printSchoolDetails(school);
    }

    // creating the values
    private   void printSchoolDetails(schoolClass school){
        school.classDetails();
        school.classFeature();
    }
}
