class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        
          if (nums == null || nums.length == 0)
            return new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            
             if (i != 0 && nums[i] == nums[i - 1])
                continue;
            
            int c=i+1,r=nums.length-1;
            
           while(c<r){
               
               int sum = nums[i] +nums[c]+nums[r];
               
               if(sum == 0){
                   res.add(Arrays.asList(nums[i], nums[c], nums[r]));
                    c++;
                    while (c < r && nums[c] == nums[c - 1])
                        c++;
                    r--;
                    while (c < r && nums[r] == nums[r + 1])
                        r--;
               }
               else if(sum < 0){
                   c++;
                   while(c<r && nums[c]==nums[c-1]){
                       c++;
                   }
               }
               else{
                   r--;
                   while(c<r && nums[r]==nums[r+1]){
                       r--;
                   }
               }
           }
        }
        
        return res;
    }
}