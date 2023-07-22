class Solution {
    public int maxProfit(int[] prices) {
        Stack<Integer> st = new Stack<>();
		int ans=0;
		for(int i : prices){
			if(st.isEmpty())st.push(i);
			else{
				if(i<st.peek())st.push(i);
				else ans=Math.max(ans,i-st.peek());
			}
		}

		return ans;
    }
}
