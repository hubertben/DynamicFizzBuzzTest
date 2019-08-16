/**
 * @ File Name: FizzBuzz
 * @ Developer: Ben Hubert Version: 1.0.0
 */
package fizzbuzz;

public class FizzBuzz {

    public static String[] words = {"Fizz", "Buzz"};
    public static int[] nums = {3, 5};

    public static void main(String[] args) {

        for (int i = 1; i < 200; i++) {
            String output = "";
            for (int j = 0; j < words.length; j++) {
                if (i % nums[j] == 0) {
                    output += words[j];
                }
            }
            if ("".equals(output)) {
                System.out.println(i);
            } else {
                System.out.println(output);
            }

        }

    }

}
