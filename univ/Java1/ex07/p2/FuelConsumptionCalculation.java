class SimpleCar{
  private int beginTime;
  private int finishTime;
  private int hours;
  private int meter;
  private String maker;
  private float fuelEconomy;

  SimpleCar(int beginTime,int finishTime,int meter,int hours,String maker){
    this.beginTime = beginTime;
    this.finishTime = finishTime;
    this.meter = meter;
    this.hours = hours;
    this.maker = maker;
    switch(maker){
      case "Honda":
        fuelEconomy = 14f;
        break;
      case "Toyota":
        fuelEconomy = 15.5f;
        break;
      case "Nissan":
        fuelEconomy = 13f;
        break;
      case "Van":
        fuelEconomy = 10.5f;
        break;
    }
  }

  public float calculateFuelConsumptionOldRegulations(){
    return meter/fuelEconomy;
  }
  public float calculateFuelConsumptionNewRegulations(){
    return meter/fuelEconomy;
  }
  public float getFuelEconomy(){
    return fuelEconomy;
  }
  public int getBeginTime(){
    return beginTime;
  }
  public int getFinishTime(){
    return finishTime;
  }
  public int getMeter(){
    return beginTime;
  }
  public int getHours(){
    return hours;
  }
  public String getMaker(){
    return maker;
  }
}

class AdvancedCar extends SimpleCar{
  private float airConitionerFuelEconomy;
  AdvancedCar(int beginTime,int finishTime,int meter,int hours,String maker){
    super(beginTime,finishTime,meter,hours,maker);
    switch(maker){
      case "Honda":
        airConitionerFuelEconomy = 10.5f;
        break;
      case "Toyota":
        airConitionerFuelEconomy = 9.5f;
        break;
      case "Nissan":
        airConitionerFuelEconomy = 0;
        break;
      case "Van":
        airConitionerFuelEconomy = 6f;
        break;
    }
  }
  public float calculateFuelConsumptionOldRegulations(){
    return getMeter()/getFuelEconomy()+(getFinishTime()-getBeginTime())/airConitionerFuelEconomy;
  }
  public float calculateFuelConsumptionNewRegulations(){
    return getMeter()/getFuelEconomy()+(getFinishTime()-getBeginTime())/airConitionerFuelEconomy;
  }
  public float getAirConditionerFuelEconomy(){
    return airConitionerFuelEconomy;
  }
}
class DeluxeCar extends AdvancedCar{
  DeluxeCar(int beginTime,int finishTime,int meter,int hours,String maker){
    super(beginTime,finishTime,meter,hours,maker);
  }
  public float calculateFuelConsumptionOldRegulations(){
    return getMeter()/getFuelEconomy()+(getFinishTime()-getBeginTime())/getAirConditionerFuelEconomy();
  }
  public float calculateFuelConsumptionNewRegulations(){
    return getMeter()/getFuelEconomy()+getHours()/getAirConditionerFuelEconomy();
  }
}

class FuelConsumptionCalculation {
   private float fuelConsumptionOldRegulation = 0;
   private float fuelConsumptionNewRegulation = 0;
   private SimpleCar[] cars;

   FuelConsumptionCalculation() {
      /* your code is here */
      cars=new SimpleCar[4];
      cars[0]=new DeluxeCar(5,20,100,9,"Honda");
      cars[1]=new AdvancedCar(5,20,100,9,"Toyota");
      cars[2]=new SimpleCar(5,20,100,9,"Nissan");
      cars[3]=new DeluxeCar(5,20,100,9,"Van");

   }
   FuelConsumptionCalculation(SimpleCar[] cars) {
      this.cars = cars;
   }
   private void calculateFuelConsumption() {
      /* your code to calculate values of
        fuelConsumptionOldRegulation and
        fuelConsumptionNewRegulation is here */
      fuelConsumptionOldRegulation= 0;
      fuelConsumptionNewRegulation= 0;
      for(int i = 0; i < cars.length; i++){
        fuelConsumptionNewRegulation += cars[i].calculateFuelConsumptionNewRegulations();
        fuelConsumptionOldRegulation += cars[i].calculateFuelConsumptionOldRegulations();
      }
   }
   float getFuelConsumptionOldRegulations() {
      return fuelConsumptionOldRegulation;
   }
   float getFuelConsumptionNewRegulations() {
      return fuelConsumptionNewRegulation;
   }
   public static void main(String[] args){
     SimpleCar[] cars=new SimpleCar[4];
     cars[0]=new DeluxeCar(5,20,100,9,"Honda");
     cars[1]=new AdvancedCar(5,20,100,9,"Toyota");
     cars[2]=new SimpleCar(5,20,100,9,"Nissan");
     cars[3]=new DeluxeCar(5,20,100,9,"Van");
     FuelConsumptionCalculation f=new FuelConsumptionCalculation(cars);
     f.calculateFuelConsumption();
     System.out.println("Old regulations: "+f.getFuelConsumptionOldRegulations());
     System.out.println("New regulations: "+f.getFuelConsumptionNewRegulations());
     System.out.println("Difference:      "+(f.getFuelConsumptionOldRegulations()-f.getFuelConsumptionNewRegulations()));
   }
}
