class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] num2=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            num2[i]=nums[i];
            num2[i + nums.length] = nums[i];
        }
        
        return num2;
    }
}