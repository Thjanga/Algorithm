import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] song = new int[8];
        for (int i=0; i<8; i++){
            song[i] = sc.nextInt();
        }
        boolean asc = true;
        boolean desc = true;

        for (int i = 0; i < 8; i++) {
            if (song[i] != i + 1) asc = false;
            if (song[i] != 8 - i) desc = false;
        }
        if (!asc && !desc) System.out.println("mixed");
        else if (asc) System.out.println("ascending");
        else System.out.println("descending");
    }
}