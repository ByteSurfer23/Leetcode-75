class Solution {
    public String reverseVowels(String s) {
        int l = s.length();
        int lp = 0 , rp = l-1; 
        String comp = "aeiouAEIOU";
        char[] arr = s.toCharArray();
        while(lp<rp){
            // here lp<rp is added in the nested while loops so that 
            // the pointers dont overlap , if not added , 
            // in cases where value of lp = rp-1 , then the pointers crossover 
            // unecessary changes occurs
            while(lp<rp && comp.indexOf(arr[lp])== -1) lp++;
            while(lp<rp && comp.indexOf(arr[rp])== -1) rp--;
            char temp; 
            temp = arr[rp];
            arr[rp] = arr[lp];
            arr[lp] = temp;

            lp++; 
            rp--;
        }
        String s1 = String.valueOf(arr);
        return s1;
    }
}