package org.example;

public class Sedmi {
    public static void printStars(int a){
        for(int i=0;i<a;i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }
}
