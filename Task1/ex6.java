import java.util.Scanner;
/**
 * ex6
 */
public class ex6 {

    public static void main(String[] args) {
        final int N = UserInput.input("Enter count of numbers: ");

        if (N == 0) {
            System.out.println("Error: array is empty");
            return;
        }

        if (N == 1) {
            System.out.println("Incremental");
            return;
        }

        int last = UserInput.input("Enter 1-th number: ");
        int next = 0;
        
        for (int i = 1; i < N; i++) {
            next = UserInput.input("Enter " + (i+1) + "-th number");
            if (next < last) { 
                System.out.println("Not incremental");
                return;
            }
            last = next;
        }
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