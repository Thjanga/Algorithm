
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  s = sc.nextLine();
        s = s.strip();
        if (s.isEmpty()){
            System.out.println(0);
            return;
        }
        String result = s.replaceAll("\\s+", " ");
        String [] c = result.split(" ");
        System.out.println(c.length);
    }
}
