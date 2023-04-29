package com.parvez;

public class EvenDigits {
    public static void main(String[] args) {
       int[] nums={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static  int findNumbers(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

     static boolean even(int nums) {
         int numberOfDigits = digits(nums);
         return numberOfDigits%2==0;
     }

    //count numbers of digits in array
    static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;

        }
        return count;
    }
}
