import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa dice cuántos dígitos tiene un número entero que puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número: ");
        int numero = sc.nextInt();
        sc.close();

        if ((numero>=0 && numero<10)||(numero<0 && numero>-10))
            System.out.printf("El número %d tiene un dígito.", numero);
        else if ((numero>=10 && numero<100)||(numero<=-10 && numero>-100))
            System.out.printf("El número %d tiene dos dígitos.", numero);
        else if ((numero>=100 && numero<1000)||(numero<=-100 && numero>-1000))
            System.out.printf("El número %d tiene tres dígitos.", numero);
        else if ((numero>=1000 && numero<10000)||(numero<=-1000 && numero>-10000))
            System.out.printf("El número %d tiene cuatro dígitos.", numero);
        else if ((numero>=10000 && numero<100000)||(numero<=-10000 && numero>-100000))
            System.out.printf("El número %d tiene cinco dígitos.", numero);
        else
            System.out.println("El número introducido tiene más de 5 dígitos");
    }
}
