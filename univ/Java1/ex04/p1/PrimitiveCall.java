public class PrimitiveCall {
  public static void myMethod(int n) {
     System.out.println("myMethod: n= " + n);
     n = 100;
     System.out.println("myMethod: n= " + n);
   } // myMethod()

   public static void main(String argv[]) {
     int k = 5;
     System.out.println("main: k= " + k);
     myMethod(k);
     System.out.println("main: k= " + k);
   } // main()
}
