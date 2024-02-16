import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        int tempoGasto = s.nextInt();
        int velocidadeMed = s.nextInt();

        int distanciaPercorrida = tempoGasto * velocidadeMed;

        double combustivelGasto = distanciaPercorrida / 12.0;

        System.out.printf("%.3f\n", combustivelGasto);

        s.close();
    }
}
