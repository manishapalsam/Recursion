public class Steps {
    public static void main(String[] args) {
       int x=steps(10);
        System.out.println(x);
    }
    public static int steps(int n)
    {
        if(n==0)return 0;
     if(n%2==0) return 1 + steps(n/2);
    return 1 + steps(n-1);
    }

}
