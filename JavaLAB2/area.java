import java.util.Scanner;
public class area {
    static Scanner scan = new Scanner(System.in);
    area(int l, int b)
    {
        returnArea(l, b);
    }

    void returnArea(int x, int y)
    {
        System.out.println(x * y);
    }

    public static void main(String[] args) {
        int l, b;
        l = scan.nextInt();
        b = scan.nextInt();
        area ar = new area(l, b);
    }
}