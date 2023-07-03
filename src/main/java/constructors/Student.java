package constructors;

public class Student {
    String name;
    int age = 21;
    private final String univName;
    double psp;
    boolean isPlaced;

    public Student(String studentName, String universityName){
        name = studentName;
        univName = universityName;

    }
    public Student(Student old){ //copy constructor
        age = old.age;
        name = old.name;
        univName = old.univName;
    }

}
