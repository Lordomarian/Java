package com.company;

public class Break_Cont {
    public static void main(String[] args){
        int i = 1;
        while(true){
            if (i==15){
                break;
            }
            System.out.println(i);
            i++;
        }

        for(i=0;i<=15; i++){
            if(i%2==0){
                continue;
            }
            System.out.println("это нечетное число "+i);

        }
    }
}
