package model;
import java.util.ArrayList;
import node.NodeAdmin;

public class ModelAdmin {
      ArrayList<NodeAdmin> Admin;

    public ModelAdmin() {
        this.Admin = new ArrayList<>();
    }

public void insertAdmin (String Username, String Password) {
    this.Admin.add(new NodeAdmin(Username, Password)); }

    public void viewAllAdmin() {
        for (int i = 0; i < Admin.size(); i++) {
            this.Admin.get(i).viewAdmin();
            System.out.println(" -");
        }
    }

public void updatePassword (String Username,String Password){
     for (int i = 0; i <Admin.size();i++){
        if (Username.equals(Admin.get(i).getUsername())){
            Admin.get(i).setPassword(Password);
        }
    }
}

    public void deleteAdmin(String nama) {
        for (int i = 0; i < Admin.size(); i++) {
            if (nama.equals(Admin.get(i).getUsername())) {
                Admin.remove(i);
            }
        }
    }

    public String getUsername(){
        return getUsername();
    }

    public String getPassword(){
        return getPassword();
    }
}


