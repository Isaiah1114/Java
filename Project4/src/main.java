import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What type of car do you have? v = normal car, r = race car, t = truck ");
        String input = sc.nextLine();

        switch(input){
            case "v":
                Vehicle car = new Vehicle();
                System.out.println("you selected vehicle");
                car.promptVehicleInfo();
                car.OutputInfo();
                break;
            case "r":
                RaceCar racecar = new RaceCar();
                System.out.println("you selected race car");
                racecar.promptRaceCarInfo();
                racecar.OutputInfo();
                break;
            case "t":
                Truck truck = new Truck();
                System.out.println("you selected a truck");
                truck.promptTruckInfo();
                truck.OutputInfo();
                break;
            default:
                System.out.println("You didn't follow the directions!");

        }

    }

}
