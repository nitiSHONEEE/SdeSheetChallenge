class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int num = nums.length;
        int k= nums[num-1];
        int count = 1;
            for(int i = num-1; i>=0;i--){
                if(i< num -1 && nums[i] != nums[i+1]){
                    k=nums[i];
                    count++;
                    if(count>=3){
                        return k;
                    }
                }
            }

        return nums[num-1];

    }
}
