
public class App{
    public static void main(String[] args){
        Data data = new Data();
        data.setData();
        try{
            //while(true){
                for(User user : Data.getAllUsers()){
                    System.out.println(user.getName() + " " + user.getBmi() + " " + user.getBmiCategory());
                }
            //}
        } catch (Exception e) {
        }
    }
}
