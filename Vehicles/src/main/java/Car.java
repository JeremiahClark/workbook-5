public class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year); // calls Vehicle constructor
        System.out.println("Trace -- in Car constructor");
        this.numberOfDoors = numberOfDoors;
    }

    // Getter
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
