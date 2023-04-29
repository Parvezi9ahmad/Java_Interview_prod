package com.parvez;

public class searchInString {
    public static void main(String[] args) {

        String str="parvez";
        char target='a';
        boolean search = search(str, target);
        System.out.println(search);
    }

    static boolean search2(String str,char target){
        if(str.length()==0){
            return false;
        }
        else{
            for(char ch:str.toCharArray()){
                if(target==ch){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        else{
            for(int i=0;i<str.length();i++){
                if(target==str.charAt(i)){
                    return true;
                }
            }
        }
        return false;
    }
}
