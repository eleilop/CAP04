import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa dice cuál es la última cifra de un número entero introducido por teclado.");
        System.out.print("Introduce el número: ");
        long numero = sc.nextLong();
        sc.close();
        long cifra = numero%10;
        System.out.printf("La última cifra del número %d es %d", numero, cifra);
    }
}
