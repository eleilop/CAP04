import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Esto es un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten en el curso");
        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.println("1. La programación es el proceso de ... su código fuente\n1) diseñar\n2) codificar y depurar\n3) mantener\n4) Todas son correctas");
        int pregunta1 = sc.nextInt();
        if (pregunta1==4)
            total = total+1;

        System.out.println("2. ¿Quién inventó la máquina analítica?\n1) Alan Turing\n2) Charles Babbage y Ada Lovelace\n3) Grace Hopper\n4) Ninguna es correcta");
        int pregunta2 = sc.nextInt();
        if (pregunta2==2)
            total = total+1;

        System.out.println("3. ¿Cuál de estos lenguajes de programación es de bajo nivel?\n1) Java\n2) C++\n3) Ensamblador\n4) Python");
        int pregunta3 = sc.nextInt();
        if (pregunta3==3)
            total = total+1;

        System.out.println("4. ¿Cuál de estas estructuras de control hace referencia a los bucles?\n1) Iterativa\n2) Condicional\n3) Secuencial\n4) Selección");
        int pregunta4 = sc.nextInt();
        if (pregunta4==1)
            total = total+1;

        System.out.println("5. ¿Qué unidad realiza cálculos matemáticos y lógicos?\n1) Unidad de Control\n2) ALU\n3) RAM\n4) VRAM");
        int pregunta5 = sc.nextInt();
        if (pregunta5==2)
            total = total+1;

        System.out.println("6. ¿Cuál de estos es un factor de forma?\n1) Micro ATX\n2) Extended ITX\n3) URV\n4) Ninguna es correcta");
        int pregunta6 = sc.nextInt();
        if (pregunta6==1)
            total = total+1;

        System.out.println("7. ¿Cuál es la última RAM que ha salido al mercado?\n1) DDR3\n2) DDR4\n3) DDR5\n4) DDR6");
        int pregunta7 = sc.nextInt();
        if (pregunta7==3)
            total = total+1;

        System.out.println("8. ¿Qué tipo de periférico es una tarjeta de red?\n1) Entrada\n2) Salida\n3) Entrada/Salida\n4) Ninguna es correcta");
        int pregunta8 = sc.nextInt();
        if (pregunta8==3)
            total = total+1;

        System.out.println("9. ¿Cuál de estos se encarga de mostrar vídeo?\n1) GPU\n2) ALU\n3) CPU\n4) VRAM");
        int pregunta9 = sc.nextInt();
        if (pregunta9==1)
            total = total+1;

        System.out.println("10. ¿Cuál de estos conectores está en desuso?\n1) USB\n2) SCSI\n3) VGA\n4) DP");
        int pregunta10 = sc.nextInt();
        if (pregunta10==2)
            total = total+1;

        sc.close();

        System.out.println("Tu calificación es "+total+"/10");
    }
}
