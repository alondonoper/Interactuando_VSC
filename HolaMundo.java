import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        var nombre = "Andres";

        var sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();

        System.out.printf("Hola, %s: %d %.2f", nombre, 10, 3.8);

        sc.close();
    }
}
