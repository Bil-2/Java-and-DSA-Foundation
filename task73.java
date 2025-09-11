// File: task73.java
public class task73 {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.display();  // Output: Name: Unknown, Age: 0
    }
}

class Cat {
    String name;
    int age;

    // Default constructor
    public Cat() {
        name = "Unknown";
        age = 0;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
