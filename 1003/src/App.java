import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner s =  new Scanner(System.in);

       int n1 = s.nextInt();
       int n2 = s.nextInt();

       System.out.println("SOMA = " + (n1 + n2));

       s.close();
    }
}
