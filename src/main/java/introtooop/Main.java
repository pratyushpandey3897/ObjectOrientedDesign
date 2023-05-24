package introtooop;

public class Main {
    public static void main(String[] args){
        Student pratyush = new Student ();
        Student sahil = new Student ();
        pratyush.name = "Pratyush";
        sahil.name = "Sahil";
        pratyush.age = 24;
        sahil.age = 26;
        pratyush.batchName = "L1";
        sahil.batchName = "L2";
        pratyush.giveMockInterview ();
        sahil.giveMockInterview ();

    }
}
