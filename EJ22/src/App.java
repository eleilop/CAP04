import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula cuántos minutos faltan para el fin de semana.");
        System.out.print("Introduce un día de la semana (de lunes a viernes): ");
        String dia = sc.nextLine();
        dia = dia.toLowerCase();
        System.out.print("Introduce la hora: ");
        int hora = sc.nextInt();
        System.out.print("Introduce los minutos: ");
        int minuto = sc.nextInt();
        sc.close();
        long finDeSemana = (24*4*60)+(15*60);
        long hastaFinDeSemana = 0;

        switch (dia) {
            case "lunes":
                hastaFinDeSemana=(finDeSemana)-(hora*60+minuto);
                System.out.printf("Quedan %d minutos para el fin de semana", hastaFinDeSemana);
                break;
            case "martes":
                hastaFinDeSemana=(finDeSemana)-((24+hora)*60+minuto);
                System.out.printf("Quedan %d minutos para el fin de semana", hastaFinDeSemana);
                break;
            case "miercoles":
                hastaFinDeSemana=(finDeSemana)-((24*2+hora)*60+minuto);
                System.out.printf("Quedan %d minutos para el fin de semana", hastaFinDeSemana);
                break;
            case "jueves":
                hastaFinDeSemana=(finDeSemana)-((24*3+hora)*60+minuto);
                System.out.printf("Quedan %d minutos para el fin de semana", hastaFinDeSemana);
                break;
            case "viernes":
                hastaFinDeSemana=(finDeSemana)-((24*4+hora)*60+minuto);
                System.out.printf("Quedan %d minutos para el fin de semana", hastaFinDeSemana);
                break;
            default:
                System.out.println("Ya es fin de semana");
        }
    }
}