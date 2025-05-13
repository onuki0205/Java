class Rectangle extends Object implements Shape{
  private float w;
  private float h;

  Rectangle(float w,float h){
    this.w = w;
    this.h = h;
  }

  public float getArea(){
    return w * h;
  }
}
