public class ClassA {
    int a;
    ClassA(){
      a = 0;
    }
    public void methodOne(int i) {
      System.out.println("0");
    }
    public void methodTwo(int i) {
      System.out.println("0");
    }
    public void methodThree(int i) {
      System.out.println("0");
    }
    public static void methodFour(int i) {
      System.out.println("0");
    }
}

public class ClassB extends ClassA {
    ClassB(){
    }
    public static void methodOne(int i) {
      System.out.println("1");
    }
    public void methodTwo(int i) {
      System.out.println("1");
    }
    public void methodThree(int i) {
      System.out.println("1");
    }
    public static void methodFour(int i) {
      System.out.println("1");
    }
}

public class Main{
  public static void main(String[] args){
    ClassA m = new ClassA();
    ClassB n = new ClassB();

    n.methodOne(4);
    n.methodTwo(4);
    n.methodThree(4);
    n.methodFour(4);
  }
}
