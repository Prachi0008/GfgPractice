class Solution {
    public static int largest(int[] arr) {
        // code here
        // int n;
        // int largest = arr[0];
        // for (int i=0;i<arr.length;i++){
        //     if(arr[i]>largest){
        //         largest = arr[i];
        //     }
        // }
        // return largest;
        
        int n = arr.length;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
