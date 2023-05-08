import java.util.Scanner;

public class Vehicle {

    public static int milesPerGallon;
    public static int odomiter;
    public static int horsepower;

    //this field is polymorphism because its changing depending on class
    public String vehicleType = "car";


    //getters
    public int getMilesPerGallon(){
        return milesPerGallon;
    }

    public int getOdomiter(){
        return odomiter;
    }

    public int getHorsepwoer(){
        return horsepower;
    }

    //setters
    public void setMilesPerGallon(int n){
        milesPerGallon = n;
    }

    public void setOdomiter(int n){
        odomiter = n;
    }

    public void setHorsepwoer(int n){
        horsepower = n;
    }

    public void promptVehicleInfo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("How many miles per gallon does your car get?");
        int mpg = sc.nextInt();
        setMilesPerGallon(mpg);

        System.out.println("How many miles does your car have on it?");
        int od = sc.nextInt();
        setOdomiter(od);

        System.out.println("How much horsepower does your car have?");
        int hp = sc.nextInt();
        setHorsepwoer(hp);


    }

    //this is the method being overridden
    //this would also be polymorphism as the calss changes depending on the car type
    public void OutputInfo(){
        System.out.println("Here are the stats for your " + vehicleType);
        System.out.println("Mile per Gallon: " + milesPerGallon);
        System.out.println("Mile on car: " + odomiter);
        System.out.println("Horsepower: " + horsepower);
    }


}
