
import java.util.*;

public class Prime {

    static boolean isPrime(int n)
    {
        if (n <= 1) 
            return false;  
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
  
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a number: \n");
        int num = scan.nextInt();
        // Checking if num is prime or not
        if (isPrime(num))
            System.out.println("Number is Prime");
        else
            System.out.println("Number is Not Prime");
        scan.close();    

    }
}
