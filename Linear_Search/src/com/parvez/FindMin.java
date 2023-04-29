package com.parvez;

public class FindMin {
    public static void main(String[] args) {
        int[] arr={18,12,7,3,14,28};
        int min = min(arr);
        System.out.println(min);
    }
    //assme arr.lenght!=0
    //return the minimum value in the array
    static int min(int[] arr){
            int ans=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]<ans){
                    ans=arr[i];
                }
            }
        return ans;
    }
}
