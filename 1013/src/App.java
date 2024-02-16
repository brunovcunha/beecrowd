import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        int a, b, c;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        int maiorAb = (a + b + Math.abs(a - b)) / 2;
        int maiorTotal = (maiorAb + c + Math.abs(maiorAb - c)) / 2;

        System.out.println(maiorTotal + " eh o maior");

    }
}
