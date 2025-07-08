class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result=new ArrayList<>();
        if(s.length()<p.length()) return result;
        HashMap<Character,Integer> pmap=new HashMap<>();
        HashMap<Character,Integer> wmap=new HashMap<>();
        for(char c:p.toCharArray()){
            pmap.put(c,pmap.getOrDefault(c,0)+1);
        }
        int left=0,right=0;
        while(right<s.length()){
           char c=s.charAt(right);
           wmap.put(c,wmap.getOrDefault(c,0)+1);

           if(right-left+1>p.length()){
            char toremove=s.charAt(left);
            if(wmap.get(toremove)==1){
                wmap.remove(toremove);
            }else{
                wmap.put(toremove,wmap.get(toremove)-1);
            }
            left++;
           }
           if(right-left+1==p.length()){
            if(wmap.equals(pmap)){
                result.add(left);
            }
           }
           right++;
        }
        return result;
    }
}