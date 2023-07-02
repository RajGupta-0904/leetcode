class Solution {
    public int maximumGap(int[] nums) {
      int ans=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            ans=Math.max(ans,nums[i]-nums[i-1]);
        }
        return ans;
    }
}