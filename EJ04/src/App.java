import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        int hora = sc.nextInt();
        sc.close();
        long salario1 = hora*12;
        long salario2 = (hora-40)*16+40*12;
        if (hora<=40) {
            System.out.println("El sueldo semanal que le corresponde es de "+salario1+" euros");
        }
        else {
            System.out.println("El sueldo semanal que le corresponde es de "+salario2+" euros");
        }
    }
}
