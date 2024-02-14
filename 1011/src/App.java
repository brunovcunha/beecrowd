import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        double raio = s.nextDouble();

        double volume = (4/3.0) * 3.14159 * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f\n", volume);

        s.close();
    }
}
