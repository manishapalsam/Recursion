public class Message {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //write a function that prints hello world 5 times but message function to call once in main()
        message();

    }
    public static void  message()
    {
        System.out.println("Hello World");
        message1();
    }
    public static void  message1()
    {
        System.out.println("Hello World");
        message2();
    }
    public static void  message2()
    {
        System.out.println("Hello World");
        message3();
    }
    public static void  message3()
    {
        System.out.println("Hello World");
        message4();
    }
    public static void  message4()
    {
        System.out.println("Hello World");
    }
}