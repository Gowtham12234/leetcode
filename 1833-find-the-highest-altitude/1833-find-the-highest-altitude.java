class Solution {
    public int largestAltitude(int[] gain) {
        int []prefixsum=new int[gain.length];
        int max=0;
        int current=0;
        for(int i=0;i<gain.length;i++){
            current+=gain[i];
            max=Math.max(max,current);
        }
        return max;
    }
}