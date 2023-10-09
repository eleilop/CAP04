import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un día de la semana (sin tilde): ");
        String dia = sc.nextLine();
        sc.close();
        dia = dia.toLowerCase();
        switch (dia) {
            case "lunes":
                System.out.printf("Los %s a primera hora toca programación", dia);
                break;
            case "martes":
                System.out.printf("Los %s a primera hora toca lenguajes de marcas", dia);
                break;
            case "miercoles":
                System.out.printf("Los %s a primera hora toca lenguajes de marcas", dia);
                break;
            case "jueves":
                System.out.printf("Los %s a primera hora toca programación", dia);
                break;
            case "viernes":
                System.out.printf("Los %s a primera hora toca formación y orientación laboral", dia);
                break;
            case "sabado":
                System.out.printf("Los %ss no hay clase", dia);
                break;
            case "domingo":
                System.out.printf("Los %ss no hay clase", dia);
                break;
            default:
                System.out.printf("%s no es un día de la semana", dia);
                break;
        }
    }
}
