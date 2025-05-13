class Rectangle{
  private int length;
  private int height;
  Rectangle(){
    length = 0;
    height = 0;
  }
  void getData(int len,int hei){
    length = len;
    height = hei;
  }
  int rLength(){
    return length;
  }
  int rHeight(){
    return height;
  }
  int permeter(){
    return 2*length + 2*height;
  }
}

class Box extends Rectangle{
  private int width;
  Box(){
    width = 0;
  }
  void getData(int len,int hei,int wid){
    length = len;
    height = hei;
    width = wid;
  }
  int rLength(){
    return length;
  }
  int rHeight(){
    return height;
  }
  int rWidth(){
    return width;
  }
  int permeter(){
    return 4*length + 4*height + 4*width;
  }
}

class TestObject{
  public static void main(String[] args){
    Rectangle rectangle = new Rectangle();
    Box box = new Box();
    rectangle.getData(10,5);
    box.getData(10,5,5);
    System.out.println("Rectangle : ");
    System.out.println("  length : " + rectangle.rLength() + " height : " + rectangle.rHeight() + " permeter : " + rectangle.permeter());
    System.out.println("Box : ");
    System.out.println("  length : " + box.rLength() + " height : " + box.rHeight() + " width : " + box.rWidth() + " permeter : " + box.permeter());

  }
}
