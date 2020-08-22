package com.company;

import java.util.Scanner;

public class While {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int value ;
        do {
            System.out.println("введи 5");
            value = scanner.nextInt();
        }while (value!=5);

        System.out.println("Молодец!");
    }
}
