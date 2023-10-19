import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una hora (solamente la hora no los minutos): ");
        try {
            int hora = sc.nextInt();
            sc.close();
            if (hora>=6 && hora<=12) {
                System.out.println("Buenos días");
            }
            else if (hora>=13 && hora<=20) {
                System.out.println("Buenas tardes");
            }
            else if (hora>=24 || hora<0) {
                System.out.println("Hora introducida no válida");
            }
            else {
                System.out.println("Buenas noches");
            }
        } catch (NumberFormatException e) {
            System.out.println("No se ha introducido un número");
        } catch (Exception e) {
            System.out.println("Se ha producido un error inesperado");
        }
    }
}
