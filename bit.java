import java.util.*;
class bit{
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number and position to check the bit is 0 or 1: ");
        int number = sc.nextInt();
        int position = sc.nextInt();
        int mask = 1 << position;
        if((number & mask) == 0){
            System.out.println("The bit is 0");
        }else{
            System.out.println("The bit is 1");
        }

    }
}     // End of the program

// Output: Enter the number and position to check the bit is 0 or 1: 5 1
// The bit is 0
// Time Complexity: O(1)
// Space Complexity: O(1)


