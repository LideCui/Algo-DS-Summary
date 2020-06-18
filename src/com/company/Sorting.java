package com.company;

public class Sorting {
    /**
     * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent,
     * with the colors in the order red, white and blue.
     *
     * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
     * @param nums
     */
    public void sortColors(int[] nums) {
        // for sort in-place we have bubble sort, insertion sort, heap sort, and quick sort
        int n = nums.length;

        for (int i=n/2-1; i>=0; i--){
            heapify(nums,n,i);
        }

        for(int i=n-1; i>0; i--){
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;

            heapify(nums, i, 0);
        }
    }

    private void heapify(int nums[], int n, int i){
        int largest  = i;
        int right = 2*i+1;
        int left = 2*i +2;

        if(left<n && nums[left]>nums[largest])
            largest = left;

        if(right<n && nums[right]>nums[largest])
            largest = right;

        if( largest != i){
            int swap = nums[i];
            nums[i] = nums[largest];
            nums[largest] = swap;

            heapify(nums, n, largest);
        }
    }
}
