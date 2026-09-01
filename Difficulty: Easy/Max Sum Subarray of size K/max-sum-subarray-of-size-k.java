class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n=arr.length;
        int sum=0;
        int res=0;
        int low=0;
        int high=k-1;
        
        for(int i=low;i<=high;i++){
            sum=sum+arr[i]; //first window sum
        }
        while(high<n){
            res=Math.max(res,sum);
            low++; //low-1
            high++; //high
        if(high==n){
            break;
        }
        sum=sum-arr[low-1]+arr[high];
        
        }
        return res;
    }
}