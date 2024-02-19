package designPatterns.builder;

public class Client {
    public static void main(String[] args) {

        Student st = Student.getBuilder ()
                .setName ("Pratyush")
                .setUniversityName ("VIT Vellore")
                .setBatch ("A1")
                .setGradYear (2022)
                .setPhoneNumber ("9812398123")
                .build ();

    }
}
