import java.util.Scanner;


public class WindchillTempperature {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insert outside temperature in Fahrenheit : ");
        double outsideTemp = input.nextDouble();

        System.out.println("Insert wind speed >=2 : ");
        double speed = input.nextDouble();

        double v2 = (Math.pow(speed , 0.16));

        double windChillTemp = (35.74 + 0.6215 * outsideTemp - 35.75 * v2 + 0.4275 * outsideTemp * v2);

        System.out.println("The wind chill index is : " + windChillTemp);
    }
}
