import java.util.Random;
class CalculatingWorkingHours {
    public static void main(String[] args) {
        Employee[] e;
        Random rand = new Random();
        e = new Employee[rand.nextInt(500)];
        for(int i = 0; i< e.length; i++) {
            switch (rand.nextInt(4)) {
            case 0:
                e[i] = new Regular();
                break;
            case 1:
                e[i] = new PartTime();
                break;
            case 2:
                e[i] = new Engineer();
                break;
            case 3:
                e[i] = new Manager();
                break;
            }
        }
        int i;
        int total = 0;
        for(i=0;i<e.length;i++){
            e[i].generateNumberHours();
            // System.out.println("e["+i+"]: w is "+e[i].getW()+" h is "+e[i].getH()+" DayPayment is "+e[i].getDayPayment());
            total += e[i].getDayPayment();
        }
        System.out.println(" total : "+ total);
    } // the end of the main method
}    // the end of the class CalculatingWorkingHours

