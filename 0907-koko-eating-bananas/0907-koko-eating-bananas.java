class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high = Arrays.stream(piles).max().getAsInt();
        while(low<=high){
            int mid=low+(high-low)/2;
            if(caneat(piles,h,mid)){
                high=mid-1;
            }else{
                low=mid+1;
            }

        }return low;
        
    }
    private boolean caneat(int[] piles,int h,int k ){
        int hours=0;
        for(int pile:piles){
            hours+=Math.ceil((double)pile/k);
        }
        return hours<=h;
    }
}