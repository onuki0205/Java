import java.util.Random;
class Engineer extends Employee{
  Engineer(){
        super(2500);
    }
    public void generateNumberHours(){
        Random rand = new Random();
        switch(rand.nextInt(3)){
        case 0:
            setH(8);
            break;
        case 1:
            setH(9);
            break;
        case 2:
            setH(10);
            break;
        }
    }
}
