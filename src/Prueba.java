import java.util.Scanner;

public class Prueba {
    static void main(String[] args) {
        int n;

        System.out.print("Primer número: ");
        n = leerNumero();
    }

    private static int leerNumero() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
