import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa dice si un número entero positivo introducido por teclado es capicúa. Se permiten números de hasta 5 cifras.");
        System.out.print("Introduce el número: ");
        int numero = sc.nextInt();
        sc.close();
        int primeraCifra = 0;
        int segundaCifra = 0;
        int terceraCifra = 0;
        int cuartaCifra = 0;
        int ultimaCifra = 0;

        if (numero<10)
            System.out.printf("El número %d es capicúa", numero);
        else if (numero>=10 && numero<100 && numero%11==0)
            System.out.printf("El número %d es capicúa", numero);
        else if (numero>=100 && numero<1000) {
            primeraCifra=numero/100;
            ultimaCifra = numero%10;
            if (primeraCifra==ultimaCifra)
                System.out.printf("El número %d es capicúa", numero);
            else
                System.out.println("El número NO es capicúa");
        }
        else if (numero>=1000 && numero<10000) {
            primeraCifra=numero/1000;
            segundaCifra=(numero/100)%10;
            terceraCifra=(numero/10)%10;
            ultimaCifra = numero%10;
            if (primeraCifra==ultimaCifra && segundaCifra==terceraCifra)
                System.out.printf("El número %d es capicúa", numero);
            else
                System.out.println("El número NO es capicúa");
        }
        else if (numero>=10000 && numero<100000) {
            primeraCifra=numero/10000;
            segundaCifra=(numero/1000)%10;
            cuartaCifra=(numero/10)%10;
            ultimaCifra = numero%10;
            if (primeraCifra==ultimaCifra && segundaCifra==cuartaCifra)
                System.out.printf("El número %d es capicúa", numero);
            else
                System.out.println("El número NO es capicúa");
        }
        else
            System.out.println("El número NO es capicúa");
    }
}