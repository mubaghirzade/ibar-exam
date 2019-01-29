import java.util.Scanner;

public class Application {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // sample array
        int[][] arr = {
                {0, 1, 2, 3, 4, 5},
                {10, 11, 12, 13, 14, 15},
                {20, 21, 22, 23, 24, 25},
                {30, 31, 32, 33, 34, 35},
                {40, 41, 42, 43, 44, 45},
                {50, 51, 52, 53, 54, 55},
                {60, 61, 62, 63, 64, 65},
        };

        System.out.println("Choose direction for starting!");
        System.out.println("0 -> left to right");
        System.out.println("1 -> right to left");
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        printArray(arr, sc.nextInt());

    }


    private static void printArray(int[][] arr, int direction) {

        int a;
        int b;

        // last "a" digit for breaking line and changing the direction
        int lastA = 0;

        for (int i = 0; i < arr.length * arr[0].length; i++) {

            // vertical point of matrix
            a = i / arr[0].length;

            // find difference for changing direction
            int diff = Math.abs(lastA - a);

            // find the direction
            direction = Math.abs(direction - diff);

            // find horizontal point of matrix
            int var = (arr[a].length - 1) * direction;
            b = Math.abs(var - i % arr[a].length);

            System.out.println(arr[a][b]);

            // update last digit of "a"
            lastA = a;
        }

    }
}