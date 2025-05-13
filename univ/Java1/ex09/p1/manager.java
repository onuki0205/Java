import java.util.Random;
class Manager extends Employee{
  Manager(){
        super(2900);
    }
    public void generateNumberHours(){
        Random rand = new Random();
        switch(rand.nextInt(6)){
        case 0:
            setH(6);
            break;
        case 1:
            setH(7);
            break;
        case 2:
            setH(8);
            break;
        case 3:
            setH(9);
            break;
        case 4:
            setH(10);
            break;
        case 5:
            setH(11);
            break;
        }
    }
}

