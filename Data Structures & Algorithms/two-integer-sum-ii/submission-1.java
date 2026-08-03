class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        for (int k=0,j=n-1;k<j;)
        {
             if (numbers[k]+numbers[j]==target)
            {
               return new int[]{k + 1, j + 1};
            }
            if (numbers[k] + numbers[j] > target)
            j--;
            else {
                k++;
            }
           
        }
           return new int[]{};
    }
}
