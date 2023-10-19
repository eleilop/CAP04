import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura desde la que caerá el objeto (metros): ");
        try {
            float h = sc.nextFloat();
            sc.close();
            double t = Math.sqrt(2*h/9.81);
            if (Double.valueOf(t).isNaN())
                System.out.println("No es posible calcular el tiempo con una altura negativa");
            else
                System.out.printf("El tiempo que tardará en caer el objeto desde %.2f metros es de %.2f segundos", h,t);
        } catch (InputMismatchException e) {
            System.out.println("El dato introducido debe ser un número");
        } catch (Exception e) {
            System.out.println("Se ha producido un error inesperado");
        }
    }
}
