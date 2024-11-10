public class NumbersExample {
    public static void main(String[] args) {
        //write a function that takes number and prints it
        //print first 5 numbers:1 2 3 4 5
        //call the print() once in main method
        print1(1);
    }
    public static void print1(int n)
    {
        System.out.println(n);
        print2(2);//funct is calling anoither function with same body and definition.
    }
    public static void print2(int n)
    {
        System.out.println(n);
        print3(3);
    }
    public static void print3(int n)
    {
        System.out.println(n);
        print4(4);
    }
    public static void print4(int n)
    {
        System.out.println(n);
        print5(5);
    }

    public static void print5(int n)//print5() body changes only print and not calling any method
    {
        System.out.println(n);

    }
}
/*  methods are stored in stack:While function is not finished executing it will
remain in stack.when funct finihes executing it is removed from stak and flo w of program restored to where the function was called


how how funct call works in lang/ call stack?

lifo(last in first out ie print5() is stored last and removed first from stack)
print5(5)
=========
print4(4)
====================
print3(3)
===================
print2(2)
======================
print1(1)
===============
main()





 */