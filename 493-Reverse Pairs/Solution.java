class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    // Modified merge sort that also counts reverse pairs
    private int mergeSort(int[] nums, int low, int high) {
        if (low >= high) return 0;

        int mid = low + (high - low) / 2;
        int count = mergeSort(nums, low, mid) + mergeSort(nums, mid + 1, high);

        // Count the reverse pairs across the left and right halves
        int j = mid + 1;
        for (int i = low; i <= mid; i++) {
            while (j <= high && nums[i] > 2L * nums[j]) j++;
            count += j - (mid + 1);
        }

        merge(nums, low, mid, high); // Standard merge step
        return count;
    }

    // Standard merge function to merge two sorted halves
    private void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;

        // Merge two sorted parts
        while (i <= mid && j <= high)
            temp[k++] = (nums[i] <= nums[j]) ? nums[i++] : nums[j++];

        // Add remaining elements
        while (i <= mid) temp[k++] = nums[i++];
        while (j <= high) temp[k++] = nums[j++];

        // Copy back to original array
        System.arraycopy(temp, 0, nums, low, temp.length);
    }
}
