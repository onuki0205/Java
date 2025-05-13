class Rectangle extends Box{

  Rectangle(){
  }
  void getData(int len,int hei){
    length = len;
    height = hei;
  }

  int permeter(){
    return 2*length + 2*height;
  }




}

class Box extends Rectangle{
  int length;
  int height;
  int width;
  Box(){
    width = 0;
  }
  void getData(int len,int hei,int wid){
    length = len;
    height = hei;
    width = wid;
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
    System.out.println("  length : " + rectangle.length + " height : " + rectangle.height + " permeter : " + rectangle.permeter());
    System.out.println("Box : ");
    System.out.println("  length : " + box.length + " height : " + box.height + " width : " + box.width + " permeter : " + box.permeter());

  }
}
