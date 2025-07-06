class Solution {
     private static int getmax(int[] nums){
            int max=0;
            for(int num :nums){
                max=Math.max(max,num);
            }
            return max;
        }
        
        private int getsum(int[] nums,int threeshold ){
            int sum=0;
            for(int num:nums){
                sum+=(num+threeshold-1)/threeshold;
            }
            return sum;
        }
    public int smallestDivisor(int[] nums, int threshold) {
       
        int low=1;
        int high=getmax(nums);
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(getsum(nums,mid)<=threshold){
                    result=mid;
                    high=mid-1;
            }
            else{
                low=mid+1;
            }
        }return result;
    }
}