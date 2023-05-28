package accessmodifiers;

public class Client {
    public static void main(String[] args){
        Student student = new Student();
        //student.name = "Naman"; // Error as private
        student.batchId = 123;
        student.psp = 90.0; // protected can be accessed by classes in same package
        student.universityName = "VIT";

    }

}
