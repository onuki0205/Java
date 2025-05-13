import java.util.*;

public class User extends Person{
    private int id;
    private static int numUsers = 0;
    private String username;
    private String password;
    private final String[] roles = {"admin", "user"};
    private String role;
    private double bmi;
    private String bmiCategory;

    //constructor
    public User(String username, String name, String gender, int age, String password, double weight, double height){
        super(name, gender, age, weight, height);
        this.id = ++numUsers;
        this.username = username;
        this.password = password;
        this.bmi = Bmi.calculateBmi(this.weight, this.height);
        this.bmiCategory = Bmi.getBmiCategory(this.bmi);
    }
    public User(String username, String name, String gender, int age, String password){
        super(name, gender, age);
        this.id = ++numUsers;
        this.username = username;
        this.password = password;
    }
    //overloading constructor
    public User(String username, String name, String gender, String password){
        super(name, gender);
        this.id = ++numUsers;
        this.username = username;
        this.password = password;
    }
    //overloading constructor
    public User(String username, String name, String password){
        super(name);
        this.id = ++numUsers;
        this.username = username;
        this.password = password;
    }
    
    //getters
    public int getId(){
        return id;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String getRole(){
        return role;
    }

    //setters or fixers
    public void setPassword(String password){
        this.password = password;
    } 

    @Override
    public void setAge(int age){
        super.setAge(age);
    }

    @Override
    public void setGender(String gender){
        super.setGender(gender);
    }

    @Override
    public void setName(String name){
        super.setName(name);
    }
    public void setUsername(String username){
        this.username = username;
    }  
    public void setRole(String role){
        if(Arrays.asList(roles).contains(role)){
            this.role = role;
        }
    }
    
    public void setBmi(){
        this.bmi = Bmi.calculateBmi(this.weight, this.height);
        this.bmiCategory = Bmi.getBmiCategory(this.bmi);
    }

    public double getBmi(){
        return bmi;
    }

    public String getBmiCategory(){
        return bmiCategory;
    }
}
