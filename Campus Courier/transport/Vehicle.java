package transport;

//Other Vehicle_classes(Ebike,Drone,Bicycle) are get extended form Vehicle
public abstract class Vehicle {
    protected String id;
    //Vehicle id
    public Vehicle(String id) {
        this.id = id;
        System.out.println("Vehicle() constructor called");
    }

    
    public abstract void deliver(String item, String place);
}



