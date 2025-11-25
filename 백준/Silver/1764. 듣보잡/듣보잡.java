import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        String nosee;
        HashSet<String> nohear = new HashSet<>();
        ArrayList<String> answer = new ArrayList<>();

        for (int i=0; i<N; i++){
            nohear.add(sc.next());
        }

        for (int i=0; i<M; i++){
            nosee = sc.next();
            if (nohear.contains(nosee)){
                answer.add(nosee);
            }

        }

        System.out.println(answer.size());
        Collections.sort(answer);
        for (String s : answer){
            System.out.println(s);
        }
    }
}
