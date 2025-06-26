class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int digits=String.valueOf(nums[i]).length();
            if(digits%2==0){
                count++;
                
            }
            
        }
        return count;
        
    }
}