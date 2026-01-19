class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        ArrayList<Integer> neg=new ArrayList<>();
        ArrayList<Integer> pos=new ArrayList<>();
        
        
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(num<0){
                neg.add(num);
            }
            else{
                pos.add(num);
            }
            
        }
        int i=0;
        for(int j=0;j<pos.size();j++){
            nums[i++]=pos.get(j);
            nums[i++]=neg.get(j);
        }
        return nums;
    }
}