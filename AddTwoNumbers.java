//A program to add two numbers

import java.util.Scanner;
public class AddTwoNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter the two numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Sum is : "+(num1+num2));
        scan.close();
    }
}
