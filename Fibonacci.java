import java.util.*;
public class Fibonacci{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many numbers are needed : ");
        int n = scan.nextInt();
        int t1 = 0, t2 = 1;
        System.out.println("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + ", ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        scan.close();
    }
}