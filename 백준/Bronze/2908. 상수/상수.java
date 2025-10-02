import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int new_num1 = reverse(num1);
        int new_num2 = reverse(num2);

        System.out.println(Math.max(new_num1,new_num2));
    }

    static int reverse(int number){
        int first = number%10;
        number = number - first;
        int seconde = (number%100)/10;
        int third = number/100;
        int reversed_num = first*100+seconde*10+third;
        return  reversed_num;
    }
}