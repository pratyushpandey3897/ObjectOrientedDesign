package constructors;

public class Client {
    public static void main(String[] args) {
//        Student st = new Student ();// error as there is a parametrized constructos
            Student st1 = new Student("Pratyush" , "VIT");

        Student st2 = new Student(st1);
        st2.name = "Aman"; // wont change the name of st1 as both are not same but a cpy of each other

        System.out.println ("DEBUG");

    }
}
