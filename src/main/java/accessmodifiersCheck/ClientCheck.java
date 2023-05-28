package accessmodifiersCheck;

import accessmodifiers.Student;

public class ClientCheck {
    public static void main(String[] args){
        Student student = new Student ();
//        student.name = "Naman"; // error as private and outside package also
//        student.batchId = 123; // error as default and not in same package
//        student.psp = 90.0; // error as protected and not in same package
        student.universityName = "NIT";

    }
}
