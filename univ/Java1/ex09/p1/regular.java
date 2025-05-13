import java.util.Random;
class Regular extends Employee{
  Regular(){
        super(2000);
    }
    public void generateNumberHours(){
        Random rand = new Random();
        switch(rand.nextInt(2)){
        case 0:
            setH(8);
            break;
        case 1:
            setH(9);
            break;
        }
    }
}
