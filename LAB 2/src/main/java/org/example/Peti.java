package org.example;

import java.util.Scanner;

public class Peti {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number:");
        int n = sc.nextInt();

        int result = (int)Math.pow(2,n);
        System.out.println("The result is: "+result);
    }
}
