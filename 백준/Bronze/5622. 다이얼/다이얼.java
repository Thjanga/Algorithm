import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        Map<String, Integer> Alphabet = new HashMap<>();
        Alphabet.put("ABC", 2);
        Alphabet.put("DEF", 3);
        Alphabet.put("GHI", 4);
        Alphabet.put("JKL", 5);
        Alphabet.put("MNO", 6);
        Alphabet.put("PQRS", 7);
        Alphabet.put("TUV", 8);
        Alphabet.put("WXYZ", 9);

        int sum = 0;

        for (char ch : S.toCharArray()) {
            for (String key : Alphabet.keySet()) {
                if (key.contains(String.valueOf(ch))) {
                    sum += Alphabet.get(key);
                    break;
                }
            }
        }
        System.out.println(sum+S.length());
    }
}