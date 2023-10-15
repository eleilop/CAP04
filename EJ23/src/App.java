import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la base imponible: ");
        float base = sc.nextLong();
        sc.nextLine();

        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String ivaTipo = sc.nextLine();
        ivaTipo = ivaTipo.toLowerCase();
        int ivaPor = 0;
        float iva = 0;
        if (ivaTipo.equals("reducido")) {
            ivaPor = 10;
            iva = ivaPor*base/100;
        }
        else if (ivaTipo.equals("superreducido")) {
            ivaPor = 4;
            iva = ivaPor*base/100;
        }
        else {
            ivaPor = 21;
            iva = ivaPor*base/100;
        }

        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codigo = sc.nextLine();
        sc.close();
        float promocion = 0;
        if (codigo.equals("mitad"))
            promocion = (base+iva)/2;
        else if (codigo.equals("meno5"))
            promocion = 5;
        else if (codigo.equals("5porc"))
            promocion = (5*(base+iva)/100);
        else
            promocion = 0;
        
        float total = base+iva-promocion;

        System.out.printf("%-20s %.2f%n", "Base imponible", base);
        System.out.printf("IVA (%d%%%-13s %.2f%n", ivaPor, ")", iva);
        System.out.printf("%-20s %.2f%n", "Precio con IVA", base+iva);
        System.out.printf("Cód. promo. (%s): %s%.2f%n", codigo, "-", promocion);
        System.out.printf("%-21s %.2f", "TOTAL", total);
    }
}
