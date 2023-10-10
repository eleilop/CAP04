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
        if (media<5)
            System.out.printf("La nota del boletín es %.2f (insuficiente)", media);
        else if (media>=5 && media<6)
            System.out.printf("La nota del boletín es %.2f (suficiente)", media);
        else if (media>=6 && media<7)
            System.out.printf("La nota del boletín es %.2f (bien)", media);
        else if (media>=7 && media<9)
            System.out.printf("La nota del boletín es %.2f (notable)", media);
        else 
            System.out.printf("La nota del boletín es %.2f (sobresaliente)", media);
    }
}
