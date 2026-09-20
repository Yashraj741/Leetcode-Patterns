import java.util.Arrays;

public class TwoSumII {
    public static int[] twosum(int[] num, int target) {
        int left = 0 ;
        int right = num.length - 1;

        while(left < right) {
            int sum = num[right] + num[left];

            if( sum == target) {
                return new int[]{left+1, right+1};
            }else if(target> sum) {
                left++;
            }else {
                right--;
            }
            
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] num = {1,2,4,7,77};
        int target = 8;

        int[] result = twosum(num, target);
        System.out.println(Arrays.toString(result));
    }
}
