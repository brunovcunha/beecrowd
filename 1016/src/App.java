import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        int km = s.nextInt();

        System.out.println(km * 2 + " minutos");

        s.close();
    }
}
