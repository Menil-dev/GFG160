// 2 1 5 4 6 3 2 1 - 21546321, 21564321
// identify breakpoint if none print sorted array
// swap the elements of breakpoint and sort the other half.


class GFG05 {
    void nextPermutation(int[] arr) {
        int i=arr.length-1;
        for(i=i;i>0;i--)
        {
            if(arr[i]>arr[i-1]) break;
        }
        if(i==0)
        {
            Arrays.sort(arr); return;
        }
        else
        {
            i--;
            int minIndex=i+1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[i] && arr[j]<arr[minIndex])
                {
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
            Arrays.sort(arr,i+1,arr.length);
        }
    }
}
