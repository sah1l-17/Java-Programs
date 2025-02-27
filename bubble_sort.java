public class bubble_sort{
    // class to print array
    public static void printArray(int array[]){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int array[] = {5, 2, 6, 1, 10, 9};
        // Time Complexity = O(n^2)
        // bubble sort
        for(int i = 0; i < array.length; i++){              // n times 
            for(int j = 0; j < array.length-i-1; j++){      // n times 
                if(array[j] > array[j+1]){                  // > for ascending 
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        printArray(array);
    }
}
// Note: Both the function i.e. calling function and called function sould be either static or non-static.
// Output: 1 2 5 6 9 10
// Time Complexity: O(n^2)  
// Space Complexity: O(1)  