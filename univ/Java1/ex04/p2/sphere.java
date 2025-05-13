class Sphere{
  float r;
  float pi = (float)Math.PI;
  float v,h;

  Sphere(float r){
    this.r = r;
  }

  float volume(){
    v = (float)(4.0 / 3.0) * r1 * r1 * r1 * pi;
    return v;
  }

  float heightContactPoint(Sphere secondSphere){
    r2 = secondSphere.r;
    h = 2*r*r2/(r+r2);
    return h;
  }
}

class TestSphere{
  public static void main(String[] args) {
    Sphere sphere1 = new Sphere(4);
    Sphere sphere2 = new Sphere(4);
    Sphere sphere3 = new Sphere(6);

    System.out.println("Volume of sphere1 : "+ sphere1.volume() + " cm^3");
    System.out.println("Volume of sphere2 : "+ sphere2.volume() + " cm^3");
    System.out.println("Volume of sphere3 : "+ sphere3.volume() + " cm^3");

    System.out.println("heightContactPoint of sphere1 and sphere2 : " + sphere1.heightContactPoint(sphere2) + " cm");
    System.out.println("heightContactPoint of sphere1 and sphere3 : " + sphere1.heightContactPoint(sphere3) + " cm");
    System.out.println("heightContactPoint of sphere2 and sphere3 : " + sphere2.heightContactPoint(sphere3) + " cm");


  }
}
