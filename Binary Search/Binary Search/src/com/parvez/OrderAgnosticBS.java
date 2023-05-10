package com.parvez;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        /*int[] arr={-18,-12,-4,0,2,4,8,14,15,18,22,25,89};*/
        int[] arr={98,82,34,22,18,15,11,9,3,2,1};
        int target=22;
        int ans = orderagnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderagnosticBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }

            if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(target<arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
