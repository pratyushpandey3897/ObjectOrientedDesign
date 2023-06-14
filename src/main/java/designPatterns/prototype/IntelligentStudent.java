package designPatterns.prototype;

public class IntelligentStudent extends Student{
    int iq;

    public IntelligentStudent(){

    }

    public IntelligentStudent(IntelligentStudent intelligentStudent){
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }
    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent (this);
    }
}
