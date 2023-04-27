package com.parvez;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimension {
    public static void main(String[] args) {
        /*int[][] arr=new int[3][];

        int[][] arr2d={
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };*/
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];

        //input to array
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();
            }
        }

        //output
        /*for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }*/
        //or

       /* for(int row=0;row< arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
*/
        //or
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
