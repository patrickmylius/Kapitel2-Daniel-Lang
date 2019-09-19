import java.util.Scanner;
// READING input from console

public class Kapitel2MilesConverter {
    public static void main(String[] args) {

        System.out.println("Enter distance in miles :");
        Scanner s = new Scanner(System.in);

        double distanceInMiles = s.nextDouble();
        //assigns value

        System.out.println(distanceInMiles + " miles = " + milesTokm(distanceInMiles) + " km ");

        System.out.println("Enter distance in km : ");
        double distanceInKm = s.nextDouble();

        System.out.println(distanceInKm + " km = " + kmTomiles(distanceInKm) + " miles");

    }
    //returns the result of the console written amount of miles * with 1.6 and converts to miles.
    private static double milesTokm(double distanceInMiles) {
        return distanceInMiles * 1.6;
    }
    //returns the result of the console written amount of kilometers * 0,6 and converts to kilometers.
    private static double kmTomiles(double distanceInKm) {
        return distanceInKm * 0.6;
    }
}
