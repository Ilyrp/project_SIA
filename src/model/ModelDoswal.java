package model;

import java.util.ArrayList;
import java.util.jar.Attributes.Name;

import node.NodeDoswal;

public class ModelDoswal {
    ArrayList<NodeDoswal> dosWal;

    public ModelDoswal() {
        this.dosWal = new ArrayList<>();
    }

public void insertDoswal (String nip, String namaDosen, String kewarganegaraan, String NoTelp) {
    this.dosWal.add(new NodeDoswal (nip, namaDosen, kewarganegaraan, NoTelp)); }

    public void viewAllDosen() {
        for (int i = 0; i < dosWal.size(); i++) {
            this.dosWal.get(i).viewDosen();
            System.out.println(" -");
        }
    }

public void updateNoTelpDoswal (String namaDoswal,String NoTelp){
     for (int i = 0; i <dosWal.size();i++){
        if (namaDoswal.equals(dosWal.get(i).getNama_Doswal())){
            dosWal.get(i).setNoTelpDoswal(NoTelp);
        }
    }
}

    public void deleteDosen(String namaDoswal) {
        for (int i = 0; i < dosWal.size(); i++) {
            if (namaDoswal.equals(dosWal.get(i).getNama_Doswal())) {
                dosWal.remove(i);
            }
        }
    }
}
