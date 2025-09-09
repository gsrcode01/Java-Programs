import transport.*;

public class MainT {
    public static void main(String[] args) {
        //Vehicle -> Bicycle -> EBike
        EBike e = new EBike("RJ-159", 80);
        e.deliver("SAHI RAJBOG", "SAMMATHI GARDEN");

        Drone d = new Drone("RJ-DR-1");
        d.deliver("Notes", "ExamCell");   // RESTRICTED
        d.deliver( "HARD-DISK", "APJ-KALAM Block");    // ALLOWED

        double bill = d.cost(10);
        System.out.println("Drone delivery cost: Rs." +bill);
    }
}