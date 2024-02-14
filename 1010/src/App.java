import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        int cod01 = s.nextInt();
        int quant01 = s.nextInt();
        double preco01 = s.nextDouble();
        double total01 = quant01 * preco01;

        int cod02 = s.nextInt();
        int quant02 = s.nextInt();
        double preco02 = s.nextDouble();
        double total02 = quant02 * preco02;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total01 + total02);

        s.close();
    }
}
