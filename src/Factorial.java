public class Factorial {
    public static void main(String[] args) {
       int x= fact(5);
        System.out.println(x);
    }
    public static int fact(int n)
    {
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
}
