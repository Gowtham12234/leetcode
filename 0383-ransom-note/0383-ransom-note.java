class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> rmap=new HashMap<>();
        HashMap<Character,Integer> mmap=new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            rmap.put(c,rmap.getOrDefault(c,0)+1);
        }
        for(int i=0;i<magazine.length();i++){
            char c=magazine.charAt(i);
            mmap.put(c,mmap.getOrDefault(c,0)+1);
        }
        for (char c : rmap.keySet()) {
            if (mmap.getOrDefault(c, 0) < rmap.get(c)) {
                return false;
            }
        }
        return true;


    }
}