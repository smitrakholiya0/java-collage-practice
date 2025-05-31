import java.util.*;
public class array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int colu = sc.nextInt();
        int [][] numbers = new int[row][colu];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colu; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < colu; j++) {
                    System.out.print(numbers[i][j] + " ");
                }
                System.out.println();


            }


    }
}
