class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>>q=new PriorityQueue<>((a,b)-> a.getValue()-b.getValue());
        for(Map.Entry<Integer,Integer> ent:m.entrySet()){
            q.offer(ent);
            if(q.size()>k){
                q.poll();
            }
        }
        int[] result=new int [k];
        int index=0;
        while(!q.isEmpty()){
            result[index++]=q.poll().getKey();
        }
        return result;
    }
}