import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Por favor, introduzca el valor de a: ");
        try {
            float a = sc.nextInt();
            System.out.print("Ahora introduzca el valor de b: ");
            float b = sc.nextInt();
            sc.close();
            float x = (-b/a);
            System.out.println("x = "+x);
        } catch (ArithmeticException e) {
            System.out.println("Esa ecuación no tiene solución real.");
        } catch (NumberFormatException e) {
            System.out.println("Los datos introducido deben ser números.");
        } catch (Exception e) {
            System.out.println("Se ha producido un error inesperado");
        }
    }
}
