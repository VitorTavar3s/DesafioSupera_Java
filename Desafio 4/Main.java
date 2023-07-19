import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite a quantidade de casos de teste:");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Digite os casos de teste\n");


        List<String> resultado = new ArrayList<>();

        for (int i = 0; i < n; i++){
            String casos = scanner.nextLine();
            int caracteres = casos.length();
            int frase = caracteres/2;

            String primeiraFrase = casos.substring(0,frase);
            String segundaFrase = casos.substring(frase);

            String reversoPrimeira = new StringBuilder(primeiraFrase).reverse().toString();
            String reversoSegunda = new StringBuilder(segundaFrase).reverse().toString();

            String frasePronta =reversoPrimeira + reversoSegunda;
            resultado.add(frasePronta);

        }
        scanner.close();
        for (String frasePronta : resultado) {
            System.out.println(frasePronta);
        }
    }
}