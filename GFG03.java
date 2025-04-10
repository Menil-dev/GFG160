class GFG03 {
    public void reverseArray(int arr[]) {
        int i=0; int j=arr.length-1; int temp;
        while(i<j)
        {
            temp=arr[i];
            arr[i++]=arr[j];
            arr[j--]=temp;
        }
    }
}