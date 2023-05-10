package com.parvez;

public class SpliteArray {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 8, 10};
        int m = 2;
        int i = spliteArrays(arr, m);
        System.out.println(i);
    }

    static int spliteArrays(int[] arr, int m) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }
        while (start < end) {
            int mid = start + (end - start) / 2;

            int pieces=1;
            int sum=0;

            for(int num:arr){
                if(sum+num>mid){
                    sum=num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }

            if(pieces>m){
                start=mid+1;
            }
            else{
                end=mid;
            }

        }

        return end;
    }

    /*static int spliteArrays(int[] nums, int m) {
        //first find maximumber number in the array and  total value in the array.
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end = end + nums[i];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            int pieces = 1;
            int sum = 0;

            for (int num : nums) {
                if (sum + num > mid) {

                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }*/
}
