class Solution {
    public void reverseArray(int arr[]) {
        // code here
        // int[] a = new int[arr.length];
        // int j = 0;
        int n = arr.length;
        for(int i=0; i<arr.length/2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
            // arr[i] = 
        }
        // return(a);
    }
    
}