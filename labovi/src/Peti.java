import java.util.Scanner;

public class Peti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number:");

        int x = input.nextInt();

        if(x>0){
            System.out.println("Number is positive");
        }
        else if(x<0){
            System.out.println("Number is negative");
        }
        else System.out.println("Number is 0");
    }
}
