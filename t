// This program demonstrates method overriding using inheritance.

// Base class Vehicle
class Vehicle {
    /**
     * The drive method for a generic vehicle.
     * This method is intended to be overridden by subclasses.
     */
    public void drive() {
        System.out.println("Driving a vehicle.");
    }
}

// Subclass Car that inherits from Vehicle
class Car extends Vehicle {
    /**
     * This method overrides the drive() method from the Vehicle class.
     * It provides a specific implementation for a Car.
     */
    @Override
    public void drive() {
        System.out.println("Repairing a car.");
    }
}

// Main class to run the program
public class MainVehicle {
    public static void main(String[] args) {
        // Create an instance of the Car class
        Car myCar = new Car();

        // Call the drive() method.
        // The overridden method in the Car class will be executed.
        myCar.drive();
    }
}

