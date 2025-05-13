import java.util.Calendar;
import java.text.SimpleDateFormat;

class Main {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");

        System.out.print("Nice to see you, Shunsuke!");
        System.out.println(" It's " + date.format(cal.getTime()) + ".");
    }

}
