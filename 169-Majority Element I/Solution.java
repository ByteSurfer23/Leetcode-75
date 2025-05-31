class Solution {
    public:
    int majorityElement(vector<int>& nums) {
        int l = nums.size(); 
        map<int, int> map1;
        for (int i = 0; i < l; i++) {
            map1[nums[i]]++;
        }
        for (auto i = map1.begin(); i != map1.end(); i++) {
            if (i->second > l / 2) {
                return i->first;
            }
        }
        return 0;
    }
    
};