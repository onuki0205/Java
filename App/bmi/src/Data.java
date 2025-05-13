import java.util.*;

public class Data{
    private static ArrayList<User> users = new ArrayList<>();

    //add user  
    public static void addUser(User user){
        users.add(user);
    }

    //remove user by username
    public static void removeUser(String username){
        boolean found = false;
        for(User user : users){
            if(user.getUsername().equals(username)){
                users.remove(user);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("User not found");
        }
    }
    //remove user by id
    public static void removeUser(int id){
        boolean found = false;
        for(User user : users){
            if(user.getId() == id){
                users.remove(user);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("User not found");
        }
    }


    //get all users
    public static ArrayList<User> getAllUsers(){
        return users;
    }

    /*get user by username or id*/
    //get user by username
    public static User getUser(String username){
        for(User user : users){
            if(user.getUsername().equals(username)){
                return user;
            }
        }
        System.out.println("User not found");
        return null;
    }
    //get user by id
    public static User getUser(int id){
        for(User user : users){
            if(user.getId() == id){
                return user;    
            }
        }
        System.out.println("User not found");
        return null;
    } 

    
    public void setData(){
        User user1 = new User("user1", "John", "male", 20, "password", 70, 170);
        User user2 = new User("user2", "Jane", "female", 21, "password", 60, 160);
        User user3 = new User("user3", "Jim", "male", 22, "password", 80, 180);
        User user4 = new User("user4", "Jill", "female", 23, "password", 50, 150);
        User user5 = new User("user5", "Joe", "male", 24, "password", 90, 190);
        User user6 = new User("user6", "Jill", "female", 25, "password", 40, 140);
        
        addUser(user1);
        addUser(user2);
        addUser(user3);
        addUser(user4);
        addUser(user5);
        addUser(user6);
    }
}