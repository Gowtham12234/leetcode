class Solution {
    
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int num :nums){
            hmap.put(num,hmap.getOrDefault(num,0)+1);
        }
        for(int num:hmap.keySet()){
            if(hmap.get(num)==1){
                return num;
            }
        }
        return -1;
    }
}