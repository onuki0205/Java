import java.util.Random;
class PartTime extends Employee{
  PartTime(){
        super(1000);
    }
    public void generateNumberHours(){
        Random rand = new Random();
        switch(rand.nextInt(5)){
        case 0:
            setH(0);
            break;
        case 1:
            setH(1);
            break;
        case 2:
            setH(2);
            break;
        case 3:
            setH(3);
            break;
        case 4:
            setH(4);
            break;
        }
    }
}
