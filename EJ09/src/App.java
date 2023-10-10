import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de segundo grado del tipo ax2 + bx + c = 0");
        System.out.print("Por favor, introduzca el valor de a: ");
        float a = sc.nextFloat();
        System.out.print("Ahora introduzca el valor de b: ");
        float b = sc.nextFloat();
        System.out.print("Por último introduce el valor de c: ");
        float c = sc.nextFloat();
        sc.close();
        double x1 = (-b+Math.sqrt((b*b)-4*a*c))/(2*a);
        double x2 = (-b-Math.sqrt((b*b)-4*a*c))/(2*a);
        System.out.printf("x1 = %.2f\tx2 = %.2f", x1,x2);
    }
}
