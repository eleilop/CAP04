import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una hora (solamente la hora no los minutos): ");
        int hora = sc.nextInt();
        sc.close();
        if (hora>=6 && hora<=12) {
            System.out.println("Buenos días");
        }
        else if (hora>=13 && hora<=20) {
            System.out.println("Buenas tardes");
        }
        else if (hora>=24) {
            System.out.println("Eso no es un número de hora");
        }
        else {
            System.out.println("Buenas noches");
        }
    }
}
