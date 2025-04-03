class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> store = new ArrayList<>();
        int l = candies.length;
        int i;
        int max = candies[0];
        for(i=0;i<l;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        for(i=0;i<l;i++){
            if(candies[i]+extraCandies>=max){
                store.add(true);
            }
            else{
                store.add(false);
            }
        }
         return store;
    }

   
}