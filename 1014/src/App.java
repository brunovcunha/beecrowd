import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        int distancia = s.nextInt();
        double combustivel = s.nextDouble();

        double kmL = distancia / combustivel;

        System.out.printf("%.3f km/l\n", kmL);

        s.close();
    }
}
