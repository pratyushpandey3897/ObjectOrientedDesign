package accessmodifiers;

public class Student {
    private String name;
    int batchId; // default
    protected double psp;
    public String universityName;

    void changeBatch(int newBatchId){
        // everything can be accessed from the same class
        name = "Naman";
        batchId = newBatchId;
        psp = 90.0;
        universityName = "IIT";
    }
}

