public class RemoveDuplicateFromSortedArray {
    public static int removeduplicate(int[] nums){
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if(nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];
            }
        }
        return left+1;
    }
    public static void main(String[] args) {
        int[] nums ={1,1,1,2,3,3,4,4};
        int res = removeduplicate(nums);
        System.out.println("Unique elements "+res);
    }
}