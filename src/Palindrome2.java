import java.lang.*;
public class Palindrome2 {
    public static void main(String[] args) {
      // String s=Integer.toString(1234321);
      //
        //int n=121;
       // String s=Integer.toString(n);
        String s="Man";
          boolean b=getPal(s,0,s.length()-1);
        System.out.println(b);
    }
    /*
    public static void getchar(String str) {
        for (int i = 0; i < str.length(); i++) {

            System.out.println(str.charAt(i));
        }
    }
    */


        public static boolean getPal(String s,int start,int end)
        {
            //String s= Integer.toString(n);

            if(start>=end) return true;
            else if(start!=end) return false;



                else
                    return getPal(s, start+1, end-1);



        }

    }


