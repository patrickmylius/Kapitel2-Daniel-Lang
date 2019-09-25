import java.util.Scanner;


public class MileToKm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Creates new scanner for input in console

        // Opg 2.1 Miles to KM and KM to Miles with User input in console
        double miles = 1;

        System.out.println("Input miles : ");
        miles = input.nextDouble(); //Allows console input

        double kilometers = miles * 1.6;
        System.out.println("kilometers" + kilometers);

        System.out.println("Input kilometers : ");
        kilometers = input.nextDouble();

        double miles2 = kilometers / 1.6;
        System.out.println("Miles" + miles2);


        // Opg 2.2 Area and Volume of a triangle with user input in console
        System.out.println("Declare length of traingle : ");

        double length = input.nextDouble();
        double area = Math.sqrt(3) / 4 * (Math.pow(length , 2)); // Math.sqrt (Kvadratrod)

        System.out.println(area);

        double volume = area * length;
        System.out.println(volume);

        // Opg 2.3 (Convert meters into feet)

        System.out.println("Input meters : ");

        double meters = input.nextDouble();
        double feet = meters * 3.2786;

        System.out.println(feet);

        // Opg 2.4 (Convert square meter into ping

        System.out.println("Input Square meter(s) : ");

        double squareMeters = input.nextDouble();
        double ping = squareMeters * 0.3025;

        System.out.println(ping);

    }
}
