package Arrays;

public class Soretd {
    public static void main(String[] args) {
        System.out.println(sorted(new int[]{1,2,3,4},0));

    }
    public static boolean sorted(int[] arr,int index)
    {
        if(index==arr.length-1) return true;
        return arr[index]<arr[index+1] && sorted( arr,index+1);
    }
}
