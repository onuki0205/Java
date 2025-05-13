public abstract class Person{
    protected String name;
    protected String gender;
    protected int age;
    protected double weight;
    protected double height;    

    
    //constructor
    public Person(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    //overloading constructor
    public Person(String name, String gender){
        this.name = name;
        this.gender = gender;
    }
    //overloading constructor
    public Person(String name){
        this.name = name;
        this.gender = null;
    }
    //overloading constructor
    public Person(String name, String gender, int age, double weight, double height){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    //getters
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    
    
    
}