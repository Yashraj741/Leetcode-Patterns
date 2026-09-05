public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;
        while ( left < right ) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int currentWater = width * minHeight;
            maxWater = Math.max(maxWater, currentWater);
            if(height[left] < height[right]) {
                left++;
            } else {
                right --;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int[] height = {1,3,4,1,5,6,7};
        int result = maxArea(height);

        System.out.println("Maximum Water: " + result);
    }
}
