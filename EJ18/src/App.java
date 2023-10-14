import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa dice cuál es la primera cifra de un número entero introducido por teclado. Se permiten números de hasta 5 cifras.");
        System.out.print("Introduce el número: ");
        int numero = sc.nextInt();
        sc.close();
        int cifra = 0;

        if (numero<10)
            cifra=numero;
        else if (numero>=10 && numero<100)
            cifra=numero/10;
        else if (numero>=100 && numero<1000)
            cifra=numero/100;
        else if (numero>=1000 && numero<10000)
            cifra=numero/1000;
        else if (numero>=10000 && numero<100000)
            cifra=numero/10000;
        System.out.printf("La primera cifra del número %d es %d", numero, cifra);
    }
}
