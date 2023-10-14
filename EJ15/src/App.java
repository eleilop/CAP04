import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa pinta una pirámide rellena con un carácter introducido.");
        System.out.print("Introduce el carácter: ");
        String caracter = sc.nextLine();
        System.out.println("¿Hacia donde quieres que apunte el vértice de la pirámide?\n1) Arriba\n2) Abajo\n3) Izquierda\n4) Derecha");
        System.out.print("Introduce una opción: ");
        int opcion = sc.nextInt();
        sc.close();
        switch (opcion) {
            case 1:
                // Pirámide hacia arriba
                System.out.printf("%5s%n", caracter);
                System.out.printf("%4s%s%s%n", caracter, caracter, caracter);
                System.out.printf("%3s%s%s%s%s%n", caracter, caracter, caracter, caracter, caracter);
                System.out.printf("%2s%s%s%s%s%s%s%n", caracter, caracter, caracter, caracter, caracter, caracter, caracter);
                System.out.printf("%s%s%s%s%s%s%s%s%s", caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter);
                break;
            case 2:
                // Pirámide hacia abajo
                System.out.printf("%s%s%s%s%s%s%s%s%s%n", caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter, caracter);
                System.out.printf("%2s%s%s%s%s%s%s%n", caracter, caracter, caracter, caracter, caracter, caracter, caracter);
                System.out.printf("%3s%s%s%s%s%n", caracter, caracter, caracter, caracter, caracter);
                System.out.printf("%4s%s%s%n", caracter, caracter, caracter);
                System.out.printf("%5s", caracter);
                break;
            case 3:
                // Pirámide hacia izquierda
                System.out.printf("%5s%n", caracter);
                System.out.printf("%4s%s%n", caracter, caracter);
                System.out.printf("%3s%s%s%n", caracter, caracter, caracter);
                System.out.printf("%2s%s%s%s%n", caracter, caracter, caracter, caracter);
                System.out.printf("%s%s%s%s%s%n", caracter, caracter, caracter, caracter, caracter);
                System.out.printf("%2s%s%s%s%n", caracter, caracter, caracter, caracter);
                System.out.printf("%3s%s%s%n", caracter, caracter, caracter);
                System.out.printf("%4s%s%n", caracter, caracter);
                System.out.printf("%5s", caracter);
                break;
            case 4:
                // Pirámide hacia derecha
                System.out.printf("%s%n", caracter);
                System.out.printf("%s%s%n", caracter, caracter);
                System.out.printf("%s%s%s%n", caracter, caracter, caracter);
                System.out.printf("%s%s%s%s%n", caracter, caracter, caracter, caracter);
                System.out.printf("%s%s%s%s%s%n", caracter, caracter, caracter, caracter, caracter);
                System.out.printf("%s%s%s%s%n", caracter, caracter, caracter, caracter);
                System.out.printf("%s%s%s%n", caracter, caracter, caracter);
                System.out.printf("%s%s%n", caracter, caracter);
                System.out.printf("%s", caracter);
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}