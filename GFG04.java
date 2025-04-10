public class GFG04{
    public static void reverse(int[] arr, int start, int end)
    {
        int temp;
        while(start<end)
        {
            temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
        //System.out.println(Arrays.toString(arr));
    }
    // Function to rotate an array by d elements in counter-clockwise direction.
    public static void rotateArr(int arr[], int d) {
        // add your code here
        d=d%arr.length+1;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,arr.length-d);
        reverse(arr,arr.length-d+1,arr.length-1);
    }
}