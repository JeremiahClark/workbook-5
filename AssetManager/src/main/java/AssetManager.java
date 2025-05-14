import java.util.ArrayList;
import java.time.Year;

public class AssetManager {
    public static void main(String[] args) {
        ArrayList<Asset> myAssets = new ArrayList<>();

        // Add houses
        myAssets.add(new House("My House", "2020-05-01", 250000,
                "123 Main St", 1, 2000, 5000));
        myAssets.add(new House("Vacation Home", "2018-08-15", 300000,
                "456 Lake View", 2, 1800, 8000));

        // Add vehicles
        myAssets.add(new Vehicle("Tom's Truck", "2019-03-21", 35000,
                "Ford F-150", 2019, 120000));
        myAssets.add(new Vehicle("My Car", "2021-07-30", 28000,
                "Honda Civic", 2021, 95000));

        // Display asset information
        for (Asset asset : myAssets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.printf("Current Value: $%.2f%n", asset.getValue());

            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel());
            }

            System.out.println("-----------");
        }
    }
}