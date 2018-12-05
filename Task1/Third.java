import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Third
 */
public class Third {

    public static void main(String[] args) {
        final double FIRST_KATET = UserInput.input("Enter first katet lenght: ");
        final double SECOND_KATET = UserInput.input("Enter second katet lenght: ");
        final double HYPOTINUZA = Math.sqrt(Math.pow(FIRST_KATET, 2) + Math.pow(SECOND_KATET, 2));
        final double FIELD = FIRST_KATET * SECOND_KATET / 2.;
        System.out.println("Hypotinuza is equal: " + HYPOTINUZA);
        System.out.println("Field is equal: " + FIELD);
    }
}

/**
 * UserInput 
 */
class UserInput {
    public static double input(String msg) {
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