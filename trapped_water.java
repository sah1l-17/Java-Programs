public class trapped_water {
    public static int trap(int height[]){
        int leftMax[] = new int[height.length];
        int rightMax[] = new int[height.length];
        leftMax[0] = height[0];
        rightMax[height.length-1] = height[height.length-1];
        for(int i = 1; i < height.length; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        for(int j = height.length-2; j >= 0; j--){
            rightMax[j] = Math.max(height[j], rightMax[j+1]);
        }
        int trapped_water = 0;
        for(int i = 0; i < height.length; i++){
            int water_level = Math.min(leftMax[i], rightMax[i]) - height[i];
            trapped_water += water_level;
        }
        return trapped_water;
    }
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));
    }
}
// Output: 6
// Time Complexity: O(n)
// Space Complexity: O(n)