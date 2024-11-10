package Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Merge{
    public static void main(String[] args) {
int[] arr={5,4,3};
//arr=mergeSort(arr);
       //System.out.println(Arrays.toString(arr));
     Arrays.sort(arr);//internall making use of dual pivot quicksort
     for(int e:arr)
     {
         System.out.println(e);
     }
    }

    public  static  int[] mergeSort(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }
        int mid= arr.length/2;
        int[] left= mergeSort(Arrays.copyOfRange(arr,0,mid));//a new array object cretaed with copy  values from 0 to mid of arr[]
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
   return merge(left,right);

    }

    public static int[] merge(int []first, int []second)
    {
        int[] mix= new int[first.length + second.length];

        int i=0;
        int j=0;
        int k=0;

        while(i< first.length && j< second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            }
            else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        //copy remaining elements if one of the array is not complete
            while(i< first.length)
            {
                mix[k]=first[i];
                i++;
                k++;

            }

            while(j< second.length)
            {
                mix[k]=second[j];
                j++;
                k++;

            }



return mix;
    }
}
