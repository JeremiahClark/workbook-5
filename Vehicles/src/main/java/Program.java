public class Program {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2020, 4);
        System.out.println("Car: " + car.getMake() + " " + car.getModel() + " (" + car.getYear() + "), Doors: " + car.getNumberOfDoors());

        Motorcycle bike = new Motorcycle("BMW ", "S 1000 RR", 2021, true);
        System.out.println("Motorcycle: " + bike.getMake() + " " + bike.getModel() + " (" + bike.getYear() + "), twin turbo: " + bike.hasSidecar());
    }
}