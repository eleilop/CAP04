import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String jugador1 = sc.nextLine();
        jugador1 = jugador1.toLowerCase();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        String jugador2 = sc.nextLine();
        jugador2 = jugador2.toLowerCase();
        sc.close();

        if (jugador1.equals("piedra") && jugador2.equals("piedra"))
            System.out.println("Empate");
        else if (jugador1.equals("piedra") && jugador2.equals("papel"))
            System.out.println("Gana el jugador 2");
        else if (jugador1.equals("piedra") && jugador2.equals("tijera"))
            System.out.println("Gana el jugador 1");
        else if (jugador1.equals("papel") && jugador2.equals("piedra"))
            System.out.println("Gana el jugador 1");
        else if (jugador1.equals("papel") && jugador2.equals("papel"))
            System.out.println("Empate");
        else if (jugador1.equals("papel") && jugador2.equals("tijera"))
            System.out.println("Gana el jugador 2");
        else if (jugador1.equals("tijera") && jugador2.equals("piedra"))
            System.out.println("Gana el jugador 2");
        else if (jugador1.equals("tijera") && jugador2.equals("papel"))
            System.out.println("Gana el jugador 1");
        else if (jugador1.equals("tijera") && jugador2.equals("tijera"))
            System.out.println("Empate");
        else
            System.out.println("ERROR: Opción introducida no válida");
    }
}
