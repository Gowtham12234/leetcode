class Solution {
    public void sortColors(int[] nums) {
        if(nums.length<2) return ;
        int mid= (nums.length)/2;
        int[] left=Arrays.copyOfRange(nums,0,mid);
        int[] right=Arrays.copyOfRange(nums,mid,nums.length);
        sortColors(left);
        sortColors(right);
        merge(nums,left,right);
        
    }
    private static void merge(int[] nums,int[]left,int[] right){
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                nums[k++]=left[i++];
            }else{
                nums[k++]=right[j++];
            }
        }
        while(i<left.length){
            nums[k++]=left[i++];
        }
        while(j<right.length){
            nums[k++]=right[j++];
        }
        
    }
}