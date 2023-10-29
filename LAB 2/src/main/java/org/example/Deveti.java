package org.example;

public class Deveti {
    public static void printNumbersPyramid(int x){

        for(int i=0;i<=x;i++){
            for(int j=0;j<i;j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        printNumbersPyramid(10);
        printNumbersPyramid(5);

    }

    /* To print the given output, we just print (i+1) instead of (j+1)*/

}

