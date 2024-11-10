public class ProductOfDigits {
    public static void main(String[] args) {
     int x=getPro(512);
        System.out.println(x);
    }
    public static int getPro(int n)
    {
        if(n%10==n)
        {
            return n;
        }
        return (n%10)*getPro(n/10);
    }
}
