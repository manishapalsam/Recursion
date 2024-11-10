package Sorting;
import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        String[] s={"M","A","X","Z"};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //bubble(arr);
       // System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr)
    {
        boolean swaped;
        //run the steps for n-1 times
        for(int i=0; i< arr.length; i++)
        {
            swaped=false;
            //at each step, max item will come at the last respective index
            for(int j=1; j<arr.length-i; j++)
            {
                    //swap if item is smaller than previous item
                if(arr[j]<arr[j-1])
                {

                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swaped=true;
                }


            }
           // if u  did not swap for a particular value of i ie ith pass it means array is sorted stop the program
            if(swaped==false)//!false=true
            {
                break;

            }
        }

    }

}
