import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un día del 1 al 7: ");
        try {
            int dia = sc.nextInt();
            sc.close();
            switch (dia) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("El día introducido no es correcto");
            }
        } catch (NumberFormatException e) {
            System.out.println("El día introducido no es correcto");
        } catch (Exception e) {
            System.out.println("Se ha producido un error inesperado");
        }
    }
}
