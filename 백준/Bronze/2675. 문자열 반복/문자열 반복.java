import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i=0; i<T; i++){
            int R = scanner.nextInt();
            String S = scanner.next();
            for (int j=0; j<S.length(); j++){
                for (int g=0; g<R; g++){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}