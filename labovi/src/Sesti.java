import java.util.Scanner;

public class Sesti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");

        int a = input.nextInt();
        int b = input.nextInt();

        if(a>b){
            System.out.println("First number is greater");
        }

        else if(a<b){
            System.out.println("Second number is greater");
        }
        else System.out.println("The numbers are the same");
    }
}
