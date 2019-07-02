package com.company;

public class Task11_6{
    public static void main(String[] args){
        int[] array12=new int[12];
        for(int i=0;i<12;){
            array12[i]=++i;
        }
        for(int i=0;i<12;i++){
            System.out.print(array12[i]+" ");
        }
    }
}