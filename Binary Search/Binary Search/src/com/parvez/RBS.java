package com.parvez;

public class RBS {
    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;
        int search = search(arr, target);
        System.out.println(search);

        int[] arr1={4,4,5,6,7,0,1,2,2};
        final int pivotwithduplicates = findPivotwithduplicates(arr1);
        System.out.println(pivotwithduplicates);
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if (pivot == -1) {
            return binarysearch(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return binarysearch(nums, target, 0, pivot - 1);
        } else {
            return binarysearch(nums, target, pivot + 1, nums.length-1);
        }
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            //
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivotwithduplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            //
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            //if elements of start ,end and midl are same skipe the duplicate.
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                //check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;

                //check if end is pivot.
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            } else if (arr[start]<arr[mid] || arr[start]==arr[mid] && arr[mid]>arr[end]) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

    static int binarysearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}
