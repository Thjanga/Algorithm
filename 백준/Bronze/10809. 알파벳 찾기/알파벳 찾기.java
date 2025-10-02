import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        int[] check = new int[26];
        char alphabet = 'a';
        // a~z가 문자열에 있는지 비교 있으면 체크 배열에 a~z의 인덱스 추가
        for (int i = 0; i < 26; i++) {
            int index = s.indexOf(alphabet);
            check[i]=index;
            alphabet++;
        }
        for (int i = 0; i<26; i++){
            System.out.print(check[i]);
            System.out.print(" ");
        }
    }
}