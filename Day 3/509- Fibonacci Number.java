class Solution {
    public int fib(int n) {
        if(n<=1)return n;
        int a=0,b=1;
        int f=0;
        for(int i=2;i<=n;i++){
            f=a+b;
            a=b;
            b=f;
        }
        return b;
    }
}