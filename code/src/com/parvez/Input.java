package com.parvez;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*int[] arr=new int[5];
        arr[0]=233;
        arr[1]=147;
        arr[2]=5;
        arr[3]=3;
        arr[4]=2;
        System.out.println(arr[2]);*/

        //for input
      /*  for(int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();
        }*/
        /*for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }*/

        /*for (int j : arr) {
            System.out.print(j + " ");
        }*/
       // System.out.println(Arrays.toString(arr));

        //Array of object
        String[] str=new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));
        str[1]="Parvez";
        System.out.println(Arrays.toString(str));
    }
}
