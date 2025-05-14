public class Motorcycle extends Vehicle {
    public String twin;
    private boolean hasSidecar;

    // Constructor
    public Motorcycle(String make, String model, int year, boolean hasSidecar) {
        super(make, model, year); // must call super first
        System.out.println("Trace -- in Motorcycle constructor");
        this.hasSidecar = hasSidecar;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }
}