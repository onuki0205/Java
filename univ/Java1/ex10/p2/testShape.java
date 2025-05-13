class TestShape{
  public static void main(String[] args){
    float total = 0;
    Shape[] s = new Shape[12];
    s[0] = new Point(0,0);
    s[1] = new Point(1,0);
    s[2] = new Point(0,1);
    s[3] = new Circle(1);
    s[4] = new Circle(5);
    s[5] = new Circle(10);
    s[6] = new Circle(11);
    s[7] = new Rectangle(1,1);
    s[8] = new Rectangle(2,1);
    s[9] = new Rectangle(5,2);
    s[10] = new Rectangle(10,3);
    s[11] = new Rectangle(14,6);

    for(int i = 0;i < s.length;i++){
      total += s[i].getArea();
    }
    System.out.println("Total area : " + total);
  }
}

