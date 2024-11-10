
package Arrays;
public class RotatedSorted {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3};
        System.out.println(search(arr,4,0, arr.length-1));

    }
    public static int search(int[] arr, int target,int start,int end)
    {
        int mid=start+end-start/2;
     if(arr[mid]==target)
         return mid;
     else if(start>end) return -1;
     //left sorted
        if(arr[start]<=arr[mid])
        {
            if(arr[start]<=target && target<=arr[mid])
               return search( arr,  target,start, mid-1);

            else  return search( arr,  target,mid+1, end);


        }
        //right sorted

            if(arr[mid]<=target && target<=arr[end])
                return search( arr,  target,mid+1,end);

        return search( arr,  target,start, mid-1);

        }


    }




