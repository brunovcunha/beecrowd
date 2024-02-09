import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner s =  new Scanner(System.in);

        double raio = s.nextDouble();

        double area = Math.pow(raio, 2) * 3.14159;

        System.out.printf("A=%.4f\n", area);

        s.close();
    }
}
