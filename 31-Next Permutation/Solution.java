public class Solution {
    public void nextPermutation(int[] nums) {
        int l , ind1 =-1 , i, swap; 
        l = nums.length;

        // find a[i] > a[i+1] find that position and make it index 1 , it is called break position , we find this position while traversing reverse
        for(i=l-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                ind1 = i;
                break;
            }
        }
        if(ind1 != -1){
            // if breaking point is present
            for (i = nums.length - 1; i > ind1; i--) {
                // we then find out a number greater than the number at the breaking point index and swap it with the newly found number 
                // once you have found the element immediately stop the loop
                if (nums[i] > nums[ind1]) {
                    swap = nums[i];
                    nums[i] = nums[ind1];
                    nums[ind1] = swap;
                    break;// break the loop
                }
            }
        }
         reverse(nums, ind1 + 1, nums.length - 1);
         // reverse the whole array from the immediate next position from the breaking point till the end of the array
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }

    }
