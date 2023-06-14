package designPatterns.prototype;

public class Student implements Prototype<Student> {
    private int age;
    private String batch;
    private String name;
    private double avgBatchPsp;
    private double studentPsp;

    public Student(){}

    public Student(Student student){
        this.age = student.age;
        this.name = student.name;
        this.batch = student.batch;
        this.avgBatchPsp = student.avgBatchPsp;
        this.studentPsp = student.studentPsp;



    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public double getStudentPsp() {
        return studentPsp;
    }

    public void setStudentPsp(double studentPsp) {
        this.studentPsp = studentPsp;
    }

    @Override
    public Student clone() {
        return new Student (this);
    }
}
