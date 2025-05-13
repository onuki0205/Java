package algorithm.onk;

public class User {
    private String role; // user,admin
    private String gender; // male, female, not set
    private String name; // username
    private String email; // e-mail adress

    public User(){
        this.role = "user";
        
    }
    public static void test(){

    }


    public void setRole(String role) {
        this.role = role;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
    

}
