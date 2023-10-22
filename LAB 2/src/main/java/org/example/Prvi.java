package org.example;


import java.util.Scanner;

public class Prvi {
    public static void main(String[] args) {

        String password = "paprika";
        Scanner input = new Scanner(System.in);

        while(true){
            String x = input.nextLine();
            if(x.equals(password)){
                System.out.println("Right!");
                System.out.println("My secret is: test");
                break;
            }
            else{
                System.out.println("Wrong!");
                continue;
            }
        }

    }
}