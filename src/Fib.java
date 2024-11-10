
//When recursion used : when we can break problem it into smaller problems and stops somewhere
//that is base condiotion and it is represented by answers we already know
//for eg base condition for fibonaaci is fib(1)==1 and fib(0)==0
//for eg: find nth fibonacci number
//0 1 1 2 3 5 7,,,
//fib(n)=fib(n-1)+fib(n-2)(recrsion in form of formula if reucreence relation) creating formula
//formula for such problems is recurence relation.

/*recursive tree
                 fib(4)
 */
public class Fib {
    public static void main(String[] args) {
        int ans=getFib(60);
        System.out.println(ans);
    }
    static int getFib(int n)
    {
if(n<2)

    return n;

return getFib(n-1)+getFib(n-2);
    }
}
