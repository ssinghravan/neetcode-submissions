class Solution {
    public boolean isAnagram(String s, String t) {
         if (s.length()!=t.length())
        {
            return false;
        }
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
       
        int c=0;
        if (s.length()==t.length())
        {
        for (int i=0;i<s.length();i++){
           if(arr1[i]==arr2[i])
           {
            c++;
           } 
        }
        }

        if (s.length()==c)return true;
        else return false;

    }
}

