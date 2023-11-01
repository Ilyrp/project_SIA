package model;

import java.util.ArrayList;

import node.NodeDosen;

public class ModelDosen {
    ArrayList<NodeDosen> dosen;

    public ModelDosen() {
        this.dosen = new ArrayList<>();
    }

public void insertDosen (int nip, String nama, String kewarganegaraan, String NoTelp) {
    this.dosen.add(new NodeDosen (nip, nama, kewarganegaraan, NoTelp)); }

    public void viewAllDosen() {
        for (int i = 0; i < dosen.size(); i++) {
            this.dosen.get(i).viewDosen();
            System.out.println(" -");
        }
    }

public void updateNoTelpdosen (String namadosen,String NoTelp){
     for (int i = 0; i <dosen.size();i++){
        if (namadosen.equals(dosen.get(i).getNama_Dosen())){
            
            dosen.get(i).setNoTelpDosen(NoTelp);
        }
    }
}

    public void deleteDosen(String namadosen) {
        for (int i = 0; i < dosen.size(); i++) {
            if (namadosen.equals(dosen.get(i).getNama_Dosen())) {
                dosen.remove(i);
            }
        }
    }



    public void viewDosenBy(int nip){
        for (int i = 0; i<dosen.size();i++){
            if (nip == dosen.get(i).getNip_Dosen()){
                dosen.get(i).viewDosen();
            }
        }
    }


}
