package com.company;

public class Task11_34 {
    public static void main(String[] args){
        int[] rainfall=new int[30];
        for(int i=0;i<30;i++){
            rainfall[i]=(int)(Math.random()*100);
        }
        int rain1=0;
        int rain2=0;
        for(int i=0;i<30;i++){
            if(i<=15)rain1+=rainfall[i];
            else rain2+=rainfall[i];
        }
        if(rain1>rain2){
            System.out.println("More rainfall in the 1-st half of June: "+rain1);
        }
        else if(rain1<rain2){
            System.out.println("More rainfall in the 2-nd half of June: "+rain2);
        }
             else {
            System.out.println(+rain2);
        }
    }
}
