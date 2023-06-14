package designPatterns.prototype;

public class Client {

    public static void fillRegistry(StudentRegistry registry) {
        Student aprBatchSt = new Student ();
        aprBatchSt.setBatch ("April 21");
        aprBatchSt.setAvgBatchPsp (89.1);

        registry.register ("apr21Batch", aprBatchSt);

        IntelligentStudent aprilBacthIS = new IntelligentStudent ();
        aprilBacthIS.iq = 100;
        aprilBacthIS.setBatch ("April 21");
        aprilBacthIS.setAvgBatchPsp (89.1);

        registry.register ("apr21BatchIS", aprilBacthIS);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry ();
        fillRegistry (studentRegistry);

        Student max = studentRegistry.get ("apr21Batch").clone();
        max.setName ("max");
        max.setStudentPsp (79);
        max.setAge (21);
        System.out.println ("DEBUG");

        Student intelligentMax = studentRegistry.get("apr21BatchIS").clone ();
        intelligentMax.setName ("intelligentMax");
        intelligentMax.setStudentPsp (99);
        intelligentMax.setAge (21);

        System.out.println ("DEBUG");
    }
}
