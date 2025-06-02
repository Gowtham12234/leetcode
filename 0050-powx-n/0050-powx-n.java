class Solution {
    public double myPow(double x, int n) {
          if(n<0){
            x=1/x;
            return fast_pow(x,-(long)n);
        }else{
            return fast_pow(x,n);
        }
    }
        public double fast_pow(double x,long n){
            if (n==0){
                return 1.0;
            }
            double half=fast_pow(x,n/2);
            if(n%2==0){
                return half*half;
            }
            else{
                return half*half*x;
            }
        }
}