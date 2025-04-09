class Solution {
    public boolean isSubsequence(String s, String t) {
    int subl = s.length();
    int l = t.length();
    int ssp = 0; 
    for(int i=0;i<l;i++){
        if( ssp<subl && s.charAt(ssp) == t.charAt(i)){
            ssp+=1;
        }
    }
    if(ssp==subl){
        return true;
    }
    else{
        return false;
    }
    }
}