import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int originalNumber, remainder, result = 0, n = 0;

        originalNumber = num;

        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = num;

        for (;originalNumber != 0; originalNumber /= 10){
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
        scan.close();

    }
}
