import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        System.out.println("Digite o valor alvo:");
        int k = scanner.nextInt();

        int count = numPares(arr,k);
        System.out.println("O número de pares com a diferença "+k+" é: "+count);
    }
    public static int numPares(int[] arr, int k ){
        Set<Integer> set = new HashSet<>();
        int count = 0;

        for (int i:arr) {
            if (set.contains(i-k)){
                count++;
            }
            if (set.contains(i+k)){
                count++;
            }
            set.add(i);
        }
        return count;
    }


}