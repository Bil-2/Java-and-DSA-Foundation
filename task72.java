// File: task72.java
class Animal {
    void Sound() {
        System.out.println("Some animal sound");
    }
}

class Bird extends Animal {
    @Override
    void Sound() {
        System.out.println("Chirp Chirp");
    }
}

class Cat extends Animal {
    @Override
    void Sound() {
        System.out.println("Meow Meow");
    }
}

public class task72 {
    public static void main(String[] args) {
        Animal myBird = new Bird();
        Animal myCat = new Cat();

        myBird.Sound();  // Output: Chirp Chirp
        myCat.Sound();   // Output: Meow Meow
    }
}
