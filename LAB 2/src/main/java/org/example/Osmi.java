package org.example;

public class Osmi {

    public static void printStarsPyramid(int x){

        for(int i=0;i<=x;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        printStarsPyramid(10);
        printStarsPyramid(5);

    }
    /* To print the inverted pyramid, the for loop would look like this:

            for(int i=x;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
     */
}
