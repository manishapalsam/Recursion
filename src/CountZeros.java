public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countz(301004,0));
    }
    public static int countz(int n,int c)
    {
        return helper(n,c);
    }

    public static int helper(int n,int c)
    {
        if(n==0) return c;//important step at base condition only returning argument of base which is c
        int rem=n%10;
        if(rem==0)
        return helper(n/10,c+1);
        else return helper(n/10,c);
    }
}
