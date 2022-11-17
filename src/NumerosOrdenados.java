import java.util.Scanner;

public class NumerosOrdenados {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un número entero");
        int a = s.nextInt();

        System.out.println("Ingrese otro número entero");
        int b = s.nextInt();

        String mayor = a > b ? "El mayor es " + a + " y el menor es " + b
                : "El mayor es " + b + " y el menor es " + a;
        System.out.println(mayor);

    }
}
