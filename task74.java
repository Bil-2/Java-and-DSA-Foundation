// File: task74.java
interface Animal {
    void bark();
}

class Dog implements Animal {
    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class task74 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.bark();  // Output: Dog is barking
    }
}
