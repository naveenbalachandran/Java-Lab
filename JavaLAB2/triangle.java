public class triangle {
    triangle()
    {
        System.out.println(permeter(3, 4, 5));
        System.out.println(area(3, 4, 5));
    }

    int permeter(int x,int y , int z)
    {
        return (x + y + z);
    }

    int area(int x, int y, int z)
    {
        return (int) (0.5 * x * y);
    }
    public static void main(String[] args) {
        triangle obj = new triangle();
    }
}
