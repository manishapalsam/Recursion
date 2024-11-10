public class BS {
    public static void main(String[] args) {
int[] arr={1,2,3,4,55,66,78};
int target=78;
        System.out.println (search(arr, target, 0, arr.length-1));
    }

    static int search(int[] arr, int target, int start, int end)
    {
        if (start > end) //start and end variable are benificial for the future calls.
        {    //so passed as argument
            return -1;
        }
        int mid = start + (end - start) / 2;//variable inside body of function
        if (arr[mid] == target)
        {

            return mid;
        }
        if (target < arr[mid])
        {
           return search(arr,target,start,mid-1);//if return type present then makesure u are returning the recursive fuction call
        }
        return search(arr,target,mid+1,end);
    }
}



