package com.parvez;

public class SearchInRange {
    public static void main(String[] args) {
      int[] arr={18,12,-7,3,14,28};
      int target=14;

        int result = linearSearch(arr, target, 1, 4);
        System.out.println(result);
    }

    static int linearSearch(int[] arr,int target,int start,int end){
       if(arr.length==0){
           return -1;
       }
       else{
           for(int i=start;i<=end;i++){
               int index=arr[i];
               if(index==target){
                   return i;
               }
           }
       }
        return -1;
    }
}
