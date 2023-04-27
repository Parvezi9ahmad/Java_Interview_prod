package com.parvez;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Passinginfunction {
    public static void main(String[] args) {
        int[] nums = {4, 9, 12, 3};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr) {
        arr[1] = 99;
    }
}
