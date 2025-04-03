class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = Math.min(word1.length(),word2.length());
        StringBuilder empty = new StringBuilder("");
        for(int i=0;i<m;i++){
            empty.append(word1.charAt(i));
            empty.append(word2.charAt(i));
        }
        if(m==word1.length()){
            empty.append(word2.substring(m));
        }
        else if(m==word2.length()){
            empty.append(word1.substring(m));
        }
        return empty.toString();
    }
}