package controller;
import view.Login;
import model.ModelAdmin;

public class Menu{
    
    // public void userLogin(){
    // String username = input.getUserInput("Username: ");
    // String password = input.getUserInput("Password");  
    // }

    public boolean validate(String username, String password){
        for (ModelAdmin admin : Admin )
        if (admin.getUsername.equals(username) && admin.getPassword.equals(password)){
             return true;
        }
    }
       return false;
}


