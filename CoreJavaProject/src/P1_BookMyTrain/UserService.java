package P1_BookMyTrain;

import java.util.HashMap;
import java.util.Map;

// now we will manage the userdetails. jha bhi humo user ki details manage karni pde
// wha hum Map() interface use karte hai.
public class UserService {
    private Map<String,User> userMap = new HashMap<>();
    private  User currentUser = null;

    public boolean registerUser(String username, String password, String fullName, String contact){
        if (userMap.containsKey(username)){
            System.out.println("Username already take, Please choose another.");
            return false;
        }
        User user = new User(username,password,fullName,contact);
        userMap.put(username,user);
        System.out.println("Registeration Successfull!");
        return true;
    }

    public boolean loginUser(String username, String password){
        if (!userMap.containsKey(username)){
            System.out.println("No user found with this username");
            return false;
        }
        User user = userMap.get(username);
        if (!user.getPassword().equals(password)){
            System.out.println("Incorrect Password.");
            return false;
        }
        currentUser = user;
        System.out.println("Welcome : "+currentUser.getFullName()+ " !");
        return true;
    }

    private void logOutUser(){
        if (currentUser!=null){
            System.out.println("logged Out "+currentUser.getFullName());
        }
        currentUser = null;
    }

    public User getCurrentUser() {
        return currentUser;
    }
    public boolean isLoggedIn(){
        return currentUser!=null;
    }
};
