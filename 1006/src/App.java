import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        double media = ((a * 2) + (b * 3) + (c * 5)) / 10;

        System.out.printf("MEDIA = %.1f\n", media);

        s.close();

    }
}