import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este pprograma sirve para calcular la media de tres notas.");
        System.out.print("Introduce la primera nota: ");
        float nota1 = sc.nextFloat();
        System.out.print("Introduce la segunda nota: ");
        float nota2 = sc.nextFloat();
        System.out.print("Introduce la tercera nota: ");
        float nota3 = sc.nextFloat();
        sc.close();
        float media = (nota1+nota2+nota3)/3;
        System.out.printf("La media de %.2f, %.2f y %.2f es de %.2f", nota1, nota2, nota3, media);
    }
}
