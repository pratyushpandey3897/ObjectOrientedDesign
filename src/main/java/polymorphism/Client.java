package polymorphism;

public class Client {
    public static void main(String[] args) {
        A a = new C();
        a = new B();
//        a.company()  // error as A doedsnt have company type;
    }
}
