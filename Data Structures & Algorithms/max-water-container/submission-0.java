class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
                int m=0;
        for (int i=0,j=n-1;i<j; )
        {
            int l=Math.min(heights[i], heights[j]);
            int b = j-i;
            int area=(l*b);
    
            m= Math.max(m,area);
            if (heights[i]<heights[j])
            {
                i++;
            }
            else 
            j--;
        }
        return m;
    }
}
