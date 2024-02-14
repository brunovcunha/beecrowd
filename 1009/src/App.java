import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        String nome  = s.nextLine();
        double salarioBase = s.nextDouble();
        double valorVendas = s.nextDouble();
        double salarioTotal = salarioBase + (valorVendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);

        s.close();
    }
}
