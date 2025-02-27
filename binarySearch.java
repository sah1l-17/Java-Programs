import java.util.Scanner;
public class binarySearch {
    static int binaryLogic(int [] array, int target){
        int low = 0, high = array.length-1;
        while (low <= high) {
            int mid = (low + high)/2;
            if(array[mid] == target)
            return mid;
            else if(array[mid] > target)
            high = mid - 1;
            else
            low = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int [] array = {1, 2, 4, 9, 11, 40, 88, 90};
        int target;
        System.out.print("Enter target: ");
        target = sc.nextInt();
        int result = binaryLogic(array,target);
        if(result == -1)
        System.out.println("Target not found.");
        else
        System.out.println("Target found at index : " + result);
    }
}

// Output: Enter target: 11
// Target found at index : 4
// Time Complexity: O(log(n))
// Space Complexity: O(1)