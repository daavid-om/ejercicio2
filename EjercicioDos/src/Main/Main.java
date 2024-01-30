package Main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Introduce números enteros (0 o negativo para terminar):");

        while (true) {
            int numero = sc.nextInt();

            if (numero <= 0) {
                break;
            }

            numeros.add(numero);
        }

        System.out.println("Lista original: " + numeros);

        for (int i = 0; i < numeros.size(); i++) {
            for (int j = i + 1; j < numeros.size(); j++) {
                if (numeros.get(i).equals(numeros.get(j))) {
                    numeros.set(j, 0);
                }
            }
        }

        System.out.println("Lista con duplicados sustituidos por 0: " + numeros);
    }
}
