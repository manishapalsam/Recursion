import java.lang.Math;
public class ReverseDigit {
    public static void main(String[] args) {
       /*
        reverse(0);
        System.out.println(sum);
        */
        int x=rev2(1234);
        System.out.println(x);
    }
/*
    static int sum=0;
    public static void reverse(int n)
    {
        if(n==0)return;
        int rem=n%10;
        sum=sum*10+rem;
        reverse(n/10);
    }
}
*/

    //2nd method
    static int rev2(int n) {
        int digits =(int)(Math.log10(n))+1;
        return helper(n,digits);

    }

    public static int helper(int n,int digits)
    {
        if(n%10==n) return n;

    int rem = n%10;
    return rem*(int)(Math.pow(10,digits-1))+ helper(n/10,digits-1);
}
}