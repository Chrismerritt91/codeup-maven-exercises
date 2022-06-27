import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        System.out.println("Please enter something:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("You Entered: " + input);
        if(!StringUtils.isNumeric(input)){
            System.out.println(input + " is not a number");
        }
        System.out.println("Flipped Case: " + StringUtils.swapCase(input));
        System.out.println("Reversed: " + StringUtils.reverse(input));

    }
}
