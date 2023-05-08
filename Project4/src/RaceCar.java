import java.util.Scanner;

public class RaceCar extends Vehicle{
    public static int additionalHorsepowerFromMods;
    public static double lapTime;

    //this field is polymorphism because its changing depending on class
    public String vehicleType = "race car";


    //getters
    public int getAdditionalHorsepowerFromMods(){
        return additionalHorsepowerFromMods;
    }

    public double getLapTime(){
        return lapTime;
    }


    //setters
    //this setter is sort of polymorphism as it's a modification of the horsepower returned from the base class.
    public void setAdditionalHorsepowerFromMods(int n){
        additionalHorsepowerFromMods = n;
        Vehicle.horsepower += n;
    }

    public void setLapTime( double n){
        lapTime = n;
    }

    public void promptRaceCarInfo(){
        Scanner sc = new Scanner(System.in);

        promptVehicleInfo();

        System.out.println("How much power have you gained from modification?");
        int ahp = sc.nextInt();
        setAdditionalHorsepowerFromMods(ahp);

        System.out.println("Whats your fastest laptime?");
        double lt = sc.nextDouble();
        setLapTime(lt);

    }

    public void OutputInfo(){
        System.out.println("Here are the stats for your " + vehicleType);
        System.out.println("Mile per Gallon: " + milesPerGallon);
        System.out.println("Mile on car: " + odomiter);
        System.out.println("Horsepower: " + horsepower);
        System.out.println("Lap Time at Track: " + lapTime);
    }

}
