package model;

import java.util.ArrayList;

import node.NodeSekjur;

public class ModelSekjur {
     public static ArrayList<NodeSekjur> Sekjur = new ArrayList<>();

    public ModelSekjur() {
        ModelSekjur.Sekjur = new ArrayList<>();
    }

    public void insertSekjur (String Username, String Password) {
        ModelSekjur.Sekjur.add(new NodeSekjur(Username, Password)); }

    public void view() {
        for (int i = 0; i < Sekjur.size(); i++) {
            ModelSekjur.Sekjur.get(i).view();
            System.out.println(" ---------------");
        }
    }

    public void updatePassword (String Username,String Password){
        for (int i = 0; i <Sekjur.size();i++){
            if (Username.equals(Sekjur.get(i).getUsername())){
                Sekjur.get(i).setPassword(Password);
            }
        }
    }

    public void deleteSekjur(String nama) {
        for (int i = 0; i < Sekjur.size(); i++) {
            if (nama.equals(Sekjur.get(i).getUsername())) {
                Sekjur.remove(i);
            }
        }
    }

    public boolean validateSekjur(String Username, String Password) {
        for (int i = 0; i < Sekjur.size(); i++) {
            if (Username.equals(Sekjur.get(i).getUsername()) && Password.equals(Sekjur.get(i).getPassword())) {
                return true;
            }
        }
        return false;
    }
}
