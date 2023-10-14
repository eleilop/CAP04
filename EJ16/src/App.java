import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa dice si hay probabilidad de que tu pareja te esté siendo infiel.");

        System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente\n1) Verdadero\n2) Falso\nIntroduce una opción: ");
        int pregunta1 = sc.nextInt();
        if (pregunta1==1)
            total = total+3;

        System.out.print("2. Ha aumentado sus gastos de vestuario\n1) Verdadero\n2) Falso\nIntroduce una opción: ");
        int pregunta2 = sc.nextInt();
        if (pregunta2==1)
            total = total+3;

        System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti\n1) Verdadero\n2) Falso\nIntroduce una opción: ");
        int pregunta3 = sc.nextInt();
        if (pregunta3==1)
            total = total+3;

        System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)\n1) Verdadero\n2) Falso\nIntroduce una opción: ");
        int pregunta4 = sc.nextInt();
        if (pregunta4==1)
            total = total+3;

        System.out.print("5. No te deja que mires la agenda de su teléfono móvil\n1) Verdadero\n2) Falso\nIntroduce una opción: ");
        int pregunta5 = sc.nextInt();
        if (pregunta5==1)
            total = total+3;

        System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante\n1) Verdadero\n2) Falso\nIntroduce una opción: ");
        int pregunta6 = sc.nextInt();
        if (pregunta6==1)
            total = total+3;

        System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a\n1) Verdadero\n2) Falso\nIntroduce una opción: ");
        int pregunta7 = sc.nextInt();
        if (pregunta7==1)
            total = total+3;

        System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo\n1) Verdadero\n2) Falso\nIntroduce una opción: ");
        int pregunta8 = sc.nextInt();
        if (pregunta8==1)
            total = total+3;

        System.out.print("9. Has notado que últimamente se perfuma más\n1) Verdadero\n2) Falso\nIntroduce una opción: ");
        int pregunta9 = sc.nextInt();
        if (pregunta9==1)
            total = total+3;

        System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo\n1) Verdadero\n2) Falso\nIntroduce una opción: ");
        int pregunta10 = sc.nextInt();
        if (pregunta10==1)
            total = total+3;

        sc.close();

        if (total<=10)
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        else if (total>=11 && total<22)
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        else
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
    }
}