class Solution {
    public void sortColors(int[] nums) {
        int j=0,k=nums.length-1,i=0;
        while (i <= k){
            if(nums[i]==0){
                swap(nums,i,j);
                j++;
                i++;
            }
         else if(nums[i]==2){
                swap(nums,i,k);
                k--;
            
            }
            else {
                i++;
            }
        }
    }
    
   private void swap(int arr[],int num1, int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}