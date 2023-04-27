package com.parvez;

public class max {
    public static void main(String[] args) {
        int[] arr={1,3,23,9,18};
        //System.out.println(Max(arr));
        System.out.println(MaxRange(arr,1,3));
    }

     static int Max(int[] arr) {
        int maxvalue=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxvalue){
                maxvalue=arr[i];
            }
        }
        return maxvalue;
    }

    static int MaxRange(int[] arr,int start,int end){
        int maxval=arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]>maxval){
                maxval=arr[i];
            }
        }
        return maxval;
    }
}
