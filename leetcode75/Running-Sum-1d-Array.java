// Happy Coding :)

public static int[] runningSum(int[] nums) {
        
        int temp = 0;
        for(int i = 0; i<nums.length; i++){
            nums[i] = temp + nums[i];
            temp = nums[i];
        }
        return nums;
}
