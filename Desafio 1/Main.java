import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> entrada = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        ArrayList<Integer> resultado = new ArrayList<>();

        System.out.println("Digite os valores, o primeiro número determinará a quantidade de valores:");
        entrada.add(scanner.nextInt());
        int num = entrada.get(0);
        while (entrada.size() < num+1){
            entrada.add(scanner.nextInt());
        }
            entrada.remove(0);
            scanner.close();
            for (int i : entrada) {
                if (i % 2 == 0) {
                    pares.add(i);
                } else {
                    impares.add(i);
                }
            }

            Collections.sort(pares);
            Collections.sort(impares, Collections.reverseOrder());
            resultado.addAll(pares);
            resultado.addAll(impares);
        for (int i : resultado) {
            System.out.println(i);
        }

    }
}
