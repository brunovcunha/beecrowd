import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        System.out.printf("TRIANGULO: %.3f\n", ((a * c) / 2));
        System.out.printf("CIRCULO: %.3f\n", (3.14159 * Math.pow(c, 2)));
        System.out.printf("TRAPEZIO: %.3f\n", (((a + b) * c) / 2));
        System.out.printf("QUADRADO: %.3f\n", (b * b));
        System.out.printf("RETANGULO: %.3f\n", (a * b));

        s.close();


    }
}
