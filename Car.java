package cars;

public class Car {
    // Instance members
    private String car_brand;   // brand
    private String car_model;   // model
    private double car_price;   // price
    private double car_mileage; // mileage
    private String car_owner;   // ownerName

    // Static members
    private static int total_cars = 0;    // totalCars
    private static String showroomName = "G. R. Motors";  // showroom name

    // Constructor 1
    public Car(String b, String m, double p, double mil) {
        this.car_brand = b;  // initialize brand
        this.car_model = m;  // initialize model
        this.car_price = p;  // initialize price
        this.car_mileage = mil;  // initialize mileage
        this.car_owner = "Not Assigned";  // default owner name
        total_cars++;
    }

    // Constructor 2 (overloaded)
    public Car(String b, String m, double p, double mil, String owner) {
        this.car_brand = b;  // initialize brand
        this.car_model = m;  // initialize model
        this.car_price = p;  // initialize price
        this.car_mileage = mil;  // initialize mileage
        this.car_owner = owner;  // initialize owner
        total_cars++;
    }

    // Getter & setter for ownerName
    public String getOwnerName() {
        return this.car_owner;
    }

    public void setOwnerName(String owner) {
        this.car_owner = owner;  // use the passed owner parameter
    }

    // Instance method
    public void displayDetails() {
        System.out.println("Brand: " + this.car_brand);
        System.out.println("Model: " + this.car_model);
        System.out.println("Price: " + this.car_price);
        System.out.println("Mileage: " + this.car_mileage);
        System.out.println("Owner: " + this.car_owner);
    }

    // Method to update price
    public void updatePrice(double newPrice) {
        this.car_price = newPrice;
    }

    // Static methods
    public static void showTotalCars() {
        System.out.println("Total Cars: " + total_cars);
    }

    public static void showShowroomName() {
        System.out.println("Showroom: " + showroomName);
    }

    public static void main(String[] args) {
        // Creating cars
        Car c1 = new Car("Toyota", "Corolla", 15000, 18.5);
        Car c2 = new Car("Honda", "Civic", 20000, 16.0, "John");
        Car c3 = new Car("Hyundai", "i20", 12000, 20.0);

        // Displaying details
        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();

        // Using setter and updating price
        c1.setOwnerName("Alice");  
        c1.updatePrice(16000);

        System.out.println("After Updates:");
        c1.displayDetails();

        // Static methods
        Car.showShowroomName();
        Car.showTotalCars();
    }
}

