class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int key , val , occur;
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                key = nums[i];
                val = map.get(key) + 1; 
                map.replace(key , val);
            }
            else{
                map.put(nums[i] , 1);
            }
        }
        for (Integer k : map.keySet()){
            occur = map.get(k);
            if(occur>(int)nums.length/3){
                list.add(k);
            }
            }
            return list;
    }
    
}