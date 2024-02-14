import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        double nota1 = s.nextDouble();
        double nota2 = s.nextDouble();

        double media = ((nota1 * 3.5) + (nota2 * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f\n", media);

        s.close();

    }
}
