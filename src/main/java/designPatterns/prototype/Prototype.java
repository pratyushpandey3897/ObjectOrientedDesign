package designPatterns.prototype;

public interface Prototype<T> { // since this interface method clone returns the object of a generic type T, we have to declare the interface as a generic type
    T clone();
}
