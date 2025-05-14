public class Vehicle {

    private String make;
    private String model;
    private int year;

    // Constructor
    public Vehicle(String make, String model, int year) {
        System.out.println("Trace -- in Vehicle constructor");
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getters and setters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}


