import java.util.Scanner;


public class RunwayLength {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // user inputs the take off speed in meters / seconds
        System.out.println("Enter take off speed in m/s : ");
        double v = input.nextDouble();

        // user inputs the acceleration in meters / seconds
        System.out.println("Enter acceleration in m/s : ");
        double a = input.nextDouble();

        // Math.pow used when a varaible is uplifted.
        double length = Math.pow(v , 2) / (2 * a);
        System.out.println("The runway needs to be " + length);






    }
}
