package org.example;

import java.util.Scanner;

public class Sesti {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many times should the text be printed?");
        int x = sc.nextInt();

        for(int i=0;i<x;i++){
            printText();
        }

    }
    public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
