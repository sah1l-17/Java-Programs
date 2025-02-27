import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        int number,sum = 0,remainder;
        System.out.print("Enter a number: ");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int temp = number;
        while(number > 0){
            remainder = number % 10;
            sum = (sum * 10) + remainder;
            number /= 10;
        }
        if(temp == sum)
        System.out.println("Is a palindrome.");
        else
        System.out.println("Not a palindrome.");
    }
}
// Output: Enter a number: 121
// Is a palindrome.
// Explanation: The given number is 121 which is a palindrome number.
// Time Complexity: O(log(n))
// Space Complexity: O(1)
