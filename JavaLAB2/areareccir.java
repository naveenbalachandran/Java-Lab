public class areareccir {
        public int Area(int l, int b)
        {
            return l * b;
        }
    
        public float Area(float r)
        {
            return (float) (3.14 * r * r);
        }
        public static void main(String[] args) {
            areareccir obj = new areareccir();
            System.out.println(obj.Area(1, 2));
            System.out.println(obj.Area(3));
            
        }
      
}
