package ActividadJAVA;
import java.util.Scanner;

public class TablaMultiplicarWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número para generar su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + " con ciclo while:");
        int i = 1;
        while (i <= 20) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }
    }
}
