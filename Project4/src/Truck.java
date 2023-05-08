import java.util.Scanner;

public class Truck extends Vehicle{
    public int towCap;
    public int offRoadclearance;

    //this field is polymorphism because its changing depending on class
    public String vehicleType = "truck";

    //getters
    public int getTowCap(){
        return towCap;
    }
    public int getOffRoadclearance(){
        return getOffRoadclearance();
    }

    //setters
    public void setTowCap(int n){
        towCap = n;
    }
    public void setOffRoadclearance(int n){
        offRoadclearance = n;
    }

    public void promptTruckInfo(){
        Scanner sc = new Scanner(System.in);
        promptVehicleInfo();

        System.out.println("What is the towing capacity of your Truck?");
        int tc = sc.nextInt();
        setTowCap(tc);

        System.out.println("What is the off road clearance of your truck?");
        int oc = sc.nextInt();
        setOffRoadclearance(oc);

    }

    public void OutputInfo(){
        System.out.println("Here are the stats for your " + vehicleType);
        System.out.println("Mile per Gallon: " + milesPerGallon);
        System.out.println("Mile on car: " + odomiter);
        System.out.println("Horsepower: " + horsepower);
        System.out.println("Towing Capacity: " + towCap);
        System.out.println("Clearance when off-roading: " + offRoadclearance);
    }
}
