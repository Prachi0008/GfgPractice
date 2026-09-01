class Solution {
    public ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        int n = arr.length;
        int res[] = new int[n];
        Arrays.fill(res,-1);
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && st.peek()<=arr[i])
            {
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=-1;
            }
            else 
            res[i]=st.peek();
        
        st.push(arr[i]);
        
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int val:res)
        {
            list.add(val);
        }
        return list;
    }
}