import java.util.Scanner;
/**
 * Fourth
 */
public class Fourth {

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

        System.out.println("Count of multiplies numbers: " + countMultiplies);
    }
}

class UserInput {
    public static int input(String msg) {
        System.out.print(msg);
        Scanner in = new Scanner(System.in);
        try {
            double value = in.nextDouble();
            return value;
        } catch (InputMismatchException e) {
            System.out.println("Wrong input type");
            return null;
        } finally {
            in.close();     
        }
    }
}