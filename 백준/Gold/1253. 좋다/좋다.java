import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[N];
        int result = 0;

        String numbers = scanner.nextLine();
        String[] parts = numbers.split(" ");

        for(int i=0; i<N; i++){
            array[i] = Integer.parseInt(parts[i]);
        }
        Arrays.sort(array);
        for(int k=0; k<N; k++){
            int find = array[k];
            int i = 0;
            int j = N-1;
            while (i<j){
                if(array[i]+array[j]==find){
                    if (i!=k && j!=k){
                        result++;
                        break;
                    } else if (i==k) {
                        i++;
                    } else if (j==k) {
                        j--;
                    }
                } else if (array[i]+array[j]<find) {
                    i++;
                } else j--;
                }
        }
        System.out.println(result);
    }
}
