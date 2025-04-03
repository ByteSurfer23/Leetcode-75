class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(str2.length()>str1.length()){
            //if str2 is greater that str1 then swap 
            return gcdOfStrings(str2,str1);
        }
        if(str2.equals(str1)){
            // if both are equal then return one string 
            return str1;
        }

        if(str1.startsWith(str2)){
            // if the str1 starts with str2 , we find the reminder , if we can find a 
            // divisor to divide the remainder and the main string , 
            // then it will divide the whole string
            return gcdOfStrings(str1.substring(str2.length()),str2);
            // here we substring the elements which above str2 length till the end of 
            // string , which is the remainder
        }

        return "";
    }
}