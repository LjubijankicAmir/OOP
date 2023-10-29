package org.example;

import java.util.Scanner;

public class Cetvrti {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("First:");
        int x=sc.nextInt();
        System.out.println("Last:");
        int y=sc.nextInt();

        while(x<=y){
            System.out.println(x);
            x++;
        }

    }
}
