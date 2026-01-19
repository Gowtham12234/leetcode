class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length/2;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            hmap.put(num,hmap.getOrDefault(num,0)+1);
        }
        for(int num:hmap.keySet()){
            if(hmap.get(num)>n){
                return num;
            }
        }
        return 0;
    }
}