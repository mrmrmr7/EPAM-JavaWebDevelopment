/**
 * ex5
 */
public class ex5 {

    public static void main(String[] args) {
        String test = "hello darkness my old friend";
        System.out.println(test.substring(6,15)); // return part of string from a to b

        String testFristHalf = "hello darkness ";
        String testSecondHalf = "my old friend";
        String testRecover = testFristHalf + testSecondHalf; // concatination
        System.out.println(testRecover);

        System.out.println("hello DARKNESS my old friend".equalsIgnoreCase(test)); // check if it equals with ignore case

        System.out.println(test.charAt(7)); // return symbol with 7-th index
    }
}