import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura desde la que caerá el objeto (metros): ");
        float h = sc.nextFloat();
        sc.close();
        double t = Math.sqrt(2*h/9.81);
        System.out.printf("El tiempo que tardará en caer el objeto desde %.2f metros es de %.2f segundos", h,t);
    }
}
