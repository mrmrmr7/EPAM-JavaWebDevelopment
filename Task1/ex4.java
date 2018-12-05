import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * ex4
 */
public class ex4 {

    public static void main(String[] args) {
        final int N = UserInput.input("Input array lenght: ");
        final int K = UserInput.input("Input K: ");

        int[] array = new int[N];
        int countMultiples = 0;

        for (int i = 0; i < N; i++) {
            array[i] = UserInput.input("Input " + i + " element of array: ");
            if (array[i] % K == 0) 
                countMultiples++;
        }

        System.out.println("Count of multiplies numbers: " + countMultiples);
    }
}

class UserInput {
    public static int input(String msg) {
        System.out.print(msg);
        int value = 0;
        Scanner in = new Scanner(System.in);
        try {
            value = in.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong input type");
        } 
        return value;
    }
}