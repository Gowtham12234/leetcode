class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> smap=new HashMap<>();
        HashMap<Character,Character> tmap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char d=t.charAt(i);
            if(smap.containsKey(c)){
                if(smap.get(c)!=d) return false;
            }else{
                smap.put(c,d);
            }
            if(tmap.containsKey(d)){
                if(tmap.get(d)!=c) return false;
                }else{
                    tmap.put(d,c);
                }
            
        
        }
        return true;
        

    }
}