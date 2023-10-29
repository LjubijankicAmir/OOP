package org.example;
import java.util.Random;
import java.util.Scanner;

public class Deseti {

    public static int drawNumber(){
        return new Random().nextInt(100);
    }

    public static void main(String[] args) {
        int a = drawNumber(), count=0;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Guess a number:");
            int x = sc.nextInt();
            if(x==a){
                System.out.println("Congrulations, your guess is correct!");
                break;
            }
            if(x<a){
                count++;
                System.out.println("The number is greater, guesses made: "+count);
                continue;
            }
            if(x>a){
                count++;
                System.out.println("The number is lesser, guesses made: "+count);
                continue;
            }
        }
    }
}
