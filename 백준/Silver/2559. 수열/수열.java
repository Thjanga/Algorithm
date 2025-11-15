import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,K;
        N = sc.nextInt();
        K = sc.nextInt();
        int [] tmp = new int[N];
        int [] newTmp = new int [N-K+1];
        for (int i = 0; i< tmp.length; i++){
            tmp[i] = sc.nextInt();
        }
        for (int i=0; i<newTmp.length; i++){
            int sum = 0;
            for (int j=i; j<K+i; j++){
                sum += tmp[j];
            }
            newTmp[i] = sum;
        }
        int max = Integer.MIN_VALUE;
        for (int i : newTmp) {
            max = Math.max(max, i);
        }
        System.out.println(max);
    }
}