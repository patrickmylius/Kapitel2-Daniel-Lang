import java.util.Scanner;

//Kapitel 2 Opgave 2.5
public class Kapitel2Finans {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Input rate in % : "); // 12%
        double rate = input.nextDouble();

        System.out.println("Input subtotal : "); // 10
        double subtotal = input.nextDouble();

        double gratuity = subtotal / 100.0 * rate;
        double total = gratuity + subtotal;

        System.out.println(" Your gratuity will be : " + (int)(gratuity * 100) / 100.0 + "$" ); // * 100 / 100.0 fjerner ekstra decimaler
        System.out.println("Your total will be : " + (int)(total * 100) / 100.0  + " $ "); // * 100 / 100.0 fjerner ekstra decimaler

    }
}
