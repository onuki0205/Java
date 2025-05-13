class Car{
  int horsePower;
  int speed;
  double fuelConsumption;
  int gasTank;
  int travelledTime;

  Car(){
    horsePower = 90;
    speed = 40;
    fuelConsumption = 8.0f;
    gasTank = 50;
    travelledTime =4;
  }

  void travelledTimeUp(int newTime){
    travelledTime += newTime;
  }

  void speedUp(int increment){
    speed += increment;
  }

  void applyBrakes(int decrement){
    speed -= decrement;
  }

  void printStates(){
    System.out.println("travelledTime :" + travelledTime +" speed :"+speed+" gasTank :" + (gasTank - speed * travelledTime / fuelConsumption));
  }
}

class CarDemo{
  public static void main(String[] args){
    Car car1 = new Car();
    Car car2 = new Car();
    Car car3 = new Car();
    car1.travelledTimeUp(1);
    car2.travelledTimeUp(2);
    car3.travelledTimeUp(3);
    car1.speedUp(20);
    car2.speedUp(5);
    car3.speedUp(15);
    car1.applyBrakes(10);
    car2.applyBrakes(9);
    car3.applyBrakes(8);
    car1.printStates();
    car2.printStates();
    car3.printStates();

  }
}
