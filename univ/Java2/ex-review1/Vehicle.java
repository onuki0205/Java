class PetroleumPrice{
    private final double gasolinePrice;
    private final double dieselPrice;

    PetroleumPrice(final double g, final double d) {
        gasolinePrice = g;
        dieselPrice = d;
    }

    public double getGasolineCost() {
        return gasolinePrice;
    }

    public double getDieselCost() {
        return dieselPrice;
    }
}

abstract class Vehicle {
    String modelName;
    String company;
    String owner;
    String engineType;
    double tankSize;
    double fuelConsumption;

    Vehicle(final String modelName, final String company, final String owner, final String engineType,
            final double tankSize, final double fuelConsumption) {
        this.modelName = modelName;
        this.company = company;
        this.owner = owner;
        this.engineType = engineType;
        this.tankSize = tankSize;
        this.fuelConsumption = fuelConsumption;
    }

    public String toString() {
        return new String("ModelName: " + modelName + ", Company: " + company + ", Owner: " + owner + ", EngineType: "
                + engineType + ", TankSize : " + tankSize + ", FuelConsumption: " + fuelConsumption);
    }

    public double movableDistance() {
        return tankSize * fuelConsumption;
    }

    abstract public double costFor100Km(PetroleumPrice p);

    abstract public void setAirConditionON();

    abstract public void setAirConditionOFF();
}

class Car extends Vehicle {
    int numberOfSeats;
    boolean airConditionOn = false;

    Car(final String modelName, final String company, final String owner, final String engineType,
            final double tankSize, final double fuelConsumption, final int numberOfSeats) {
        super(modelName, company, owner, engineType, tankSize, fuelConsumption);
        this.numberOfSeats = numberOfSeats;
    }

    public void setNumberOfSeat() {
    }

    public String toString() {
        return super.toString() + ", NumberOfSeat: " + numberOfSeats;
    }

    public double costFor100Km(final PetroleumPrice pprice) {
        return 100. * pprice.getGasolineCost() / fuelConsumption;
    }

    public void setAirConditionON() {
        if (airConditionOn == false) {
            fuelConsumption = fuelConsumption * 0.85;
            airConditionOn = true;
        }
    }

    public void setAirConditionOFF() {
        if (airConditionOn == true) {
            // Fill in the followings..
            airConditionOn = false;
        }
    }
}

class MiniVan extends Vehicle {
    int numberOfSeats;
    boolean airConditionOn = false;
    boolean hasAutoDoor = false;

    MiniVan(final String modelName, final String company, final String owner, final String engineType,
            final double tankSize, final double fuelConsumption, final int numberOfSeats,
            final boolean hasAutoDoor) {
        super(modelName, company, owner, engineType, tankSize, fuelConsumption);
        this.numberOfSeats = numberOfSeats;
        this.hasAutoDoor = hasAutoDoor;
    }

    public void setNumberOfSeat() {
    }

    public String toString() {
        return super.toString() + ", NumberOfSeat: " + numberOfSeats + ", HasAutoDoor: " + hasAutoDoor;
    }

    public void setHasAutoDoor(){}

    public double costFor100Km(final PetroleumPrice pprice) {
        if(this.engineType.equals("Gasoline")){
            return 100. * pprice.getGasolineCost() / fuelConsumption;
        }else if(this.engineType.equals("Diesel")){
            return 100. * pprice.getDieselCost() / fuelConsumption;
        }else if(this.engineType.equals("Hybrid")){
            return (50. * pprice.getGasolineCost() + 50. * pprice.getDieselCost()) / fuelConsumption;
        }else return 0;
    }

    public void setAirConditionON() {
        if (airConditionOn == false) {
            fuelConsumption = fuelConsumption * 0.75;
            airConditionOn = true;
        }
    }

    public void setAirConditionOFF() {
        if (airConditionOn == true) {
            // Fill in the followings..
            airConditionOn = false;
        }
    }
}

class Truck extends Vehicle {
    int numberOfSeats;
    int power;
    boolean airConditionOn = false;

    Truck(final String modelName, final String company, final String owner, final String engineType,
            final double tankSize, final double fuelConsumption, final int numberOfSeats, final int power) {
        super(modelName, company, owner, engineType, tankSize, fuelConsumption);
        this.numberOfSeats = numberOfSeats;
        this.power = power;
    }

    public void setNumberOfSeat() {
    }

    public void setPower() {
    }

    public String toString() {
        return super.toString() + ", NumberOfSeat: " + numberOfSeats + ", HorsePower: " + power;
    }

    public double costFor100Km(final PetroleumPrice pprice) {
        return 100. * pprice.getDieselCost() / fuelConsumption;
    }

    public void setAirConditionON() {
        if (airConditionOn == false) {
            fuelConsumption = fuelConsumption * 0.75;
            airConditionOn = true;
        }
    }

    public void setAirConditionOFF() {
        if (airConditionOn == true) {
            // Fill in the followings..
            airConditionOn = false;
        }
    }
}


class VehicleTest {

    public static void describe(final Vehicle v) {
        System.out.println(v);
    }

    public static void main(final String[] args) {
        final Vehicle vehicles[] = { new Car("Camley", "Toyota", "Suzuki", "Gasoline", 70., 15.15, 5),
                new Car("Aqua", "Toyota", "Nakajima", "Hybrid", 36., 40.0, 5),
                new MiniVan("Sienna", "Toyota", "Tanaka", "Gasoline", 75., 9.0, 8, true),
                new MiniVan("Odyssey", "Honda", "Kikuchi", "Diesel", 56., 11.0, 8, false),
                new MiniVan("Presage", "Nissan", "Shirotora", "Gasoline", 60., 7.0, 7, false),
                new Truck("Tundra", "Toyota", "Sugai", "Diesel", 100., 6.76, 5, 310),
                new Truck("Ridgeline", "Honda", "Watanabe", "Diesel", 83.279, 7.23, 5, 250) };

        final PetroleumPrice priceInfo = new PetroleumPrice(128.7, 105.7);

        for (final Vehicle v : vehicles) {
            describe(v);
            System.out.println("Movable distance: " + v.movableDistance() + " Km");
            System.out.println("Cost for 100 Km: " + v.costFor100Km(priceInfo) + " Yen");
            System.out.println();
        }
        System.out.println();
        System.out.println("After Aircondition is ON\n");
        for (final Vehicle v : vehicles) {
		    v.setAirConditionON();
            describe(v);
		    System.out.println("Movable distance: " + v.movableDistance() + " Km");
		    System.out.println("Cost for 100 Km: " + v.costFor100Km(priceInfo) + " Yen");
	    	System.out.println(); 
 	    }

	}  // end of main 
}
