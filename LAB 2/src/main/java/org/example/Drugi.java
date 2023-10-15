package org.example;

import java.util.Scanner;

public class Drugi {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int sum=0,read;

        System.out.println("Type the first number:");
        read=reader.nextInt();
        sum+=read;
        System.out.println("Type the second number:");
        read=reader.nextInt();
        sum+=read;
        System.out.println("Type the third number:");
        read=reader.nextInt();
        sum+=read;

        System.out.println("Sum=" + sum);

    }
}
