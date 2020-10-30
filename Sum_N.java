import java.util.*;
public class Sum_N {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int sum=0;
        for (int i = 0; i <= num; i++) {
            sum+=i;
        }
        System.out.println("The sum of 1st n natural numbers are : "+ sum);
        scan.close();
    }
}