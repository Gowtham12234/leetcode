class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap <Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            int key=nums[i];
            hm.put(key,hm.getOrDefault(key,0)+1);
            if(hm.get(key)>n/2){
                return key;
            }
        }
        return -1;
    }
}