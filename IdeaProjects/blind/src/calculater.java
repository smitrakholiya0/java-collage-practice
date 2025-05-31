import java.util.Scanner;

public class calculater {

    public static void main(String[] agr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The Calculator OF CBSC Exam Marks Percentage");

        System.out.println("Enter Your First Subject Marks");
        int sub1 = sc.nextInt();

        System.out.println("Enter Your Second Subject Marks");
        int sub2 = sc.nextInt();

        System.out.println("Enter Your Third Subject Marks");
        int sub3 = sc.nextInt();

        System.out.println("Enter Your Fourth Subject Marks");
        int sub4 = sc.nextInt();

        System.out.println("Enter Your Fifth Subject Marks");
        int sub5 = sc.nextInt();

        int sum = (sub1 + sub2 + sub3 + sub4 + sub5);

        float r1 = sum /500f;
        float per = (r1*100);

        System.out.println(per);
    }
}
