package com.parvez;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arraylistexampl {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(10);
        /*list.add(23);
        list.add(5);
        list.add(13);
        list.add(32);
        list.add(15);
        System.out.println(list);*/

        //input
        for(int i=0;i<5;i++){
          list.add(sc.nextInt());
        }

        //get the item at any index
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
    }
}
