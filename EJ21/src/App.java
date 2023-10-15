import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula la nota de un trimestre de la asignatura de programación.");
        System.out.print("Nota del primer control: ");
        float nota1 = sc.nextInt();
        System.out.print("Nota del segundo control: ");
        float nota2 = sc.nextInt();
        float media = (nota1+nota2)/2;

        if (media>=5)
            System.out.printf("Tu nota de Programación es %.1f", media);
        else {
            sc.nextLine();
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            String recuperacion = sc.nextLine();
            recuperacion = recuperacion.toLowerCase();
            if (recuperacion.equals("apto"))
                System.out.println("Tu nota de Programación es 5");
            else
                System.out.printf("Tu nota de Programación es %.1f", media);
        }
        sc.close();
    }
}
