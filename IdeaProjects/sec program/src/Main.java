import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(" we are talking number from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int a = sc.nextInt();
        System.out.println("enter number");
        int b = sc.nextInt();

        int c = a+b;
        System.out.println(c);
    }
}