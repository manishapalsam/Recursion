package Arrays;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        /*
        System.out.println(find(new int[]{2,3,1,4,4,5},4,0));
        System.out.println(findIndex(new int[]{2,3,1,4,4,5},4,0));
        System.out.println(findIndexLast(new int[]{2,3,1,4,4,5},4,5));
       findAllIndex(new int[]{2,3,1,4,4,5},4,0);
        System.out.println(list);
        System.out.println(findAllIndex2(new int[]{2,3,1,4,4,5},4,0,new ArrayList<>()));
 ArrayList<Integer> list=new ArrayList<>();
 ArrayList<Integer> ans=findAllIndex2(new int[]{2,3,1,4,4,5},4,0,list);
        System.out.println(ans);
        */

        System.out.println(findAllIndex3(new int[]{2,3,1,4,4,5},4,0));

    }

    //returning boolean value

    public static boolean find(int[] arr,int target,int index) {
        if (index > arr.length - 1) return false;
        return  arr[index] == target || find(arr, target, index + 1);
    }


 //returning index value of target elemnet
    public static int findIndex(int[] arr,int target,int index)
    {
        if(index>arr.length-1) return -1;
        else if(arr[index]==target) return index;
        return findIndex(arr,target,index+1);
    }
    //returning index valuse and searching from last index
    public static int findIndexLast(int[] arr,int target,int index)
    {
        if(index>arr.length-1) return -1;
        else if(arr[index]==target) return index;
        return findIndex(arr,target,index-1);
    }
    //to find all indexes of target
    static ArrayList<Integer> list=new ArrayList<>();
    public static void  findAllIndex(int[] arr,int target,int index)
    {
        if(index>arr.length-1) return;
        else if(arr[index]==target) list.add(index);
         findAllIndex(arr,target,index+1);
    }
    //creating ArrayList inside the function
    public static ArrayList<Integer> findAllIndex2(int[] arr,int target,int index, ArrayList<Integer> list)
    {

        if(index>arr.length-1) {

            return list;
        }
        else if(arr[index]==target) list.add(index);
        return findAllIndex2(arr,target,index+1,list);
    }


    //taking ArrayList inside the body by creating new object of ArrayListt for every function call

    public static ArrayList<Integer> findAllIndex3(int[] arr,int target,int index)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(index>arr.length-1) {

            return list;
        }
        //this will contain answer for that finction call only ie new list created for every funct call.
        else if(arr[index]==target) list.add(index);
        ArrayList<Integer> ansFromBelowCalls= findAllIndex3(arr,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }

}
