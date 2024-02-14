import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        int numero =  s.nextInt();
        int horasTrabalhadas = s.nextInt();
        double valorHora = s.nextDouble();
        

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f\n", (horasTrabalhadas * valorHora));

        s.close();
    }
}
