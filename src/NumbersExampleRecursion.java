public class NumbersExampleRecursion {
    public static void main(String[] args) {
print(1);
    }
    //u want to print from1  1 to 100o u cant create 1000 print() which as same body.so recursion used to handle this req.
    //recursion is function which calls  itself with a base codition or else infinte times the function willbe called.now in numbersexample we made 5 methods to print nos 1 to 5 but if large nos to print we cant create such many methods fo same functionality/body instead recursion is best.

    /*base condition in recursion(simple if condition) :condition where recursion will stop makin new calls
if calling a same function again and again u can treat it has separate call in stack
so for every same fuction call separate stack memory created.And if no base condion function
calls keep happening stack will be filled again and again and we know that every same function
simulatneously will take memory .So one time comes computer memory exceeds the limit ->stack overflow



how recursive funct call works in lang/ call stack?

lifo(last in first out ie print5() is stored last and removed first from stack)
print(5)
=========
print(4)
====================
print(3)
===================
print(2)
======================
print(1)
===============
main()


  =>y recursion?
  =>It helps in solving complex problems in simple way/breaking down bigger priblems
  smaller .
  =>u can convert recursive solution into iteration and vice versa.First solving complex
  problem using recursion and then convert to iteration to get more optimized sol.
  directly solving by iteration the dp problems is difficult.
  =>space complexity is not constant because of recursive calls.


  ****Visualizing the recursion(recusion tree) while recursive call/function call
  main()
  |
  print(1)
  |
  print(2)
  |
  print(3)
  |
  print(4) <= =  ==|
  |          |
  prin(5)===|
     */
    public static void print(int n)
    {
        if(n==5){
            System.out.println("hey im the base condition and done with recursion");
        System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
