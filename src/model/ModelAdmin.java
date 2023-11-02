package model;
import java.util.ArrayList;
import node.NodeAdmin;

public  class ModelAdmin {
     public static ArrayList<NodeAdmin> Admin = new ArrayList<>();

    public ModelAdmin() {
        ModelAdmin.Admin = new ArrayList<>();
    }

    public void insertAdmin (String Username, String Password) {
        ModelAdmin.Admin.add(new NodeAdmin(Username, Password)); }

    public void viewAllAdmin() {
        for (int i = 0; i < Admin.size(); i++) {
            ModelAdmin.Admin.get(i).view();
            System.out.println(" ---------------");
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

    public boolean validateAdmin(String Username, String Password) {
        for (int i = 0; i < Admin.size(); i++) {
            if (Username.equals(Admin.get(i).getUsername()) && Password.equals(Admin.get(i).getPassword())) {
                return true;
            }
        }
        return false;
    }
}



