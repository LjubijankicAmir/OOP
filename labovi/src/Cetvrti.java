import java.util.Scanner;

public class Cetvrti {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Type a number:");
        int a = input.nextInt();

        System.out.println("Type another number:");
        int b = input.nextInt();

        int c = a+b;

        System.out.println("The sum is: " + c);

    }
}
