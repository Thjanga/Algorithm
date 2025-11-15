import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1,y1,p1,q1;
        int x2,y2,p2,q2;
        for (int i=0; i<4; i++){
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            p1 = sc.nextInt();
            q1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            p2 = sc.nextInt();
            q2 = sc.nextInt();
            if (p1 < x2 || q1 < y2 || x1 > p2 || y1 > q2) {
                System.out.println("d");
                continue;
            }

            if ((p1 == x2 && y1 == q2) || (p1 == x2 && q1 == y2) || (x1 == p2 && q1 == y2) || (x1 == p2 && y1 == q2)) {
                System.out.println("c");
            } else if (y1 == q2 || p1 == x2 || q1 == y2 || x1 == p2) {
                System.out.println("b");
            }
            else System.out.println("a");
        }

    }
}