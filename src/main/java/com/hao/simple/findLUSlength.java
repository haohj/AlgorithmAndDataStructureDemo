package com.hao.simple;

public class findLUSlength {
    public static int findLUSlength(String a, String b) {
        if (a.equals(b))
            return -1;
        if((a.length()<100 && b.length()<100)){
            if(a.length()>=b.length()){
                return a.length();
            }else{
                return b.length();
            }
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(findLUSlength("aaa","aaa"));
    }
}
