class Circle extends Object implements Shape{
  private float r = 0;

  Circle(float r){
    this.r = r;
  }

  public float getArea(){
    return r * r * (float)Math.PI;
  }
}
