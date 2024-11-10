public class Sum2 {
    public static void main(String[] args) {
      int x=  sum(11234,0);
        System.out.println(x);
    }
    public static int sum(int n,int sum)
    {
       // if(n==0) return sum;
        int rem=n%10;

        sum+=rem;
        if(n==0) return sum;
        return sum(n/10,sum);

    }
}
