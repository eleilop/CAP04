import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa dice si un número es par y/o divisible entre 5.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        float num = sc.nextFloat();
        sc.close();
        
        if (num%2==0 && num%5==0)
            System.out.println(num+" es par y es divisible entre 5");
        else if (num%2==0)
            System.out.println(num+" es par y NO es divisible entre 5");
        else if (num%5==0)
            System.out.println(num+" NO es par y es divisible entre 5");
        else
            System.out.println(num+" NO es par y NO es divisible entre 5");
    }
}
