public class Nto1 {
    public static void main(String[] args) {
      //  print(5);
        reversePrint(5);
        PrintBoth(5);
    }
    //to print from n to 1
    public static void print(int n)
    {
        if(n==1)
        {

            return;
        }
        System.out.println(n);
        print(n-1);
    }
    //to print 1 to n
    public static void reversePrint(int n)
    {
        if(n==1)
        {
            System.out.println(1);
            return;
        }

        reversePrint(n-1);
        System.out.println(n);
    }
//to print in reverse and original order
    public static void PrintBoth(int n)
    {
        if(n==0){
            return;
        }
       // System.out.println(n);

        PrintBoth(n-1);
       System.out.println(n);
    }
}
