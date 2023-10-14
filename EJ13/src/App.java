import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa ordena tres números enteros introducidos por teclado");
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Introduce el tercer número: ");
        int num3 = sc.nextInt();
        sc.close();
        int menor;
        if (num1<num2 && num1<num3)
            menor=num1;
        else if (num2<num1 && num2<num3)
            menor=num2;
        else
            menor=num3;
        
        if (menor==num1)
            if (num2<num3)
                System.out.println(menor+" "+num2+" "+num3);
            else
                System.out.println(menor+" "+num3+" "+num2);
        else if (menor==num2)
            if (num1<num3)
                System.out.println(menor+" "+num1+" "+num3);
            else
                System.out.println(menor+" "+num3+" "+num1);
        else if (menor==num3)
            if (num1<num2)
                System.out.println(menor+" "+num1+" "+num2);
            else
                System.out.println(menor+" "+num2+" "+num1);
    }
}
