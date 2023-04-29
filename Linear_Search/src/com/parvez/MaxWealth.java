package com.parvez;

public class MaxWealth {
    public static void main(String[] args) {
     int[][] arr={{1,2,3},
             {1,2,1},{3,4,1}};
        int ans = maxnumValue(arr);
        System.out.println(ans);
    }
    static int maxnumValue(int[][] accounts){
        int ans=Integer.MIN_VALUE;
        for(int person=0;person< accounts.length;person++){
            int sum=0;
            for(int account=0;account<accounts[person].length;account++){
                sum+=accounts[account][person];
            }
            if(ans<sum){
                ans=sum;
            }
        }
        return ans;
    }
}
