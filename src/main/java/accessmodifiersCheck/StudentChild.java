package accessmodifiersCheck;

import accessmodifiers.Student;

public class StudentChild extends Student {

    public void main(String[] args) {
        Student st = new Student ();
//        st.psp = 90.0; //error as protected. child and outside package not allowed
//        this.name = "Naman";// private
//        this.batchId = 123 ; // error as default and different package
        this.psp = 90.0; // protected
        this.universityName = "Andaman"; //public

        st.universityName = "NIRMA"; //public
//        st.psp = 90.0; // error as protected can only be accessed by a child class

        //or we can access psp  by creating an object of the child class
        StudentChild sc = new StudentChild ();
        sc.psp = 91.0;
    }
}
