// Happy Coding :)

public int pivotIndex(int[] nums) {
        
        if (nums == null || nums.length == 0) return -1;
        int n = nums.length;
        
        for (int i = 1; i < n; i++) nums[i] += nums[i - 1];

        if (nums[n-1] - nums[0] == 0) return 0;// edge case
        
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] == nums[n - 1] - nums[i]) return i;
        }      
        return -1;        
    }
