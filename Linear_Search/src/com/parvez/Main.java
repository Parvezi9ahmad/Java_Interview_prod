package com.parvez;

public class Main {
    public static void main(String[] args) {
        int[] nums={3,15,6,4,55,19,32,18,34};
        int target=19;
        //int ans = linearSearch(nums, target);
         int ans = linearSearch2(nums, target);
        System.out.println(ans);
    }

    //search the target and return boolean.
    static boolean linearSearch3(int[] arr,int target){
        if(arr.length==0){
            return false;
        }
        else{
            //run the forloop
            for (int element : arr) {
                //check the elemnt of the array if it is found or not.
                if (element == target) {
                    return true;
                }
            }
        }
        return false;
    }

    //search the target and return the element
    static int linearSearch2(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        else{
            //run the forloop
            for (int element : arr) {
                //check the elemnt of the array if it is found or not.
                if (element == target) {
                    return element;
                }
            }
        }
        return -1;
    }

    //search in the array:return the index if item found
    //if item not found return -1
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        else{
            //run the forloop
            for(int index = 0; index <arr.length; index++){
                //check the elemnt of the array if it is found or not.
                int element=arr[index];
                if(element==target){
                    return index;
                }
            }
        }
        return -1;
    }
}
