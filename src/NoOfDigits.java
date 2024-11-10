import java.lang.Math;
public class NoOfDigits {
    public static void main(String[] args) {
     int x= get(109283298,2948,Integer.MIN_VALUE);
        System.out.println(x);
    }
    public static int get(int m,int  n,int max)
    {
     int mdigit=(int)Math.log10(m)+1;
       int ndigit=(int)Math.log10(n)+1;
        max= Math.max(mdigit,ndigit);
        return max;
    }

}
