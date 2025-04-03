class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length; 
        for(int i=0;i<l;i++){
            if(i!=0 && i!=l-1){
                if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    n=n-1;
                }
            }
            else if(i==0){
                if(l==1){
                    if(flowerbed[0]==0){
                        flowerbed[0]=1;
                        n=n-1;
                    }
                }
                if(flowerbed[i]==0 && flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    n=n-1;
                }
            }
            else if(i==l-1){
                if(flowerbed[i]==0 && flowerbed[i-1]==0){
                    flowerbed[i]=1;
                    n=n-1;
                }
            }
        }   
        if(n<=0){
            return true;
        }
        else{
            return false;
        }
    }
}