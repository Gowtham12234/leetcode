class Solution {
    public int thirdMax(int[] nums) {
        Long max=null,second=null,third=null;
        for(int num :nums){
            if((max!=null && num==max) ||
                (second!=null && num==second)||
                (third!=null && num==third)) continue;
             if(max==null || num>max){
                third=second;
                second=max;
                max=(long)num;
            }
            else if(second==null || num>second){
                third=second;
                second=(long)num;
            }
            else if(third==null || num>third){
                third=(long) num;
            }
        }
        return third==null ? max.intValue():third.intValue();
    }
}