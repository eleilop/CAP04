import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa calcula los segundos que faltan para llegar a la medianoche.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la hora (solo la hora, no los minutos): ");
        int hora = sc.nextInt();
        System.out.print("Introduce los minutos: ");
        int minuto = sc.nextInt();
        sc.close();
        long segundos = (hora*3600)+(minuto*60); /* Pasamos la hora introducida a segundos */
        long restante = (24*3600) - segundos;
        System.out.println("Faltan "+restante+" segundos para la medianoche");
    }
}