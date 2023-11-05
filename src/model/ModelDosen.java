package model;

import java.util.ArrayList;

import controller.User;
import node.NodeDosen;
import node.NodeJurusan;

public class ModelDosen {
    public static ArrayList<NodeDosen> dosen;

    public ModelDosen() {
        ModelDosen.dosen = new ArrayList<>();
    }

    public void insertDosen (int nip, String nama, String alamat, String NoTelp, NodeJurusan jurusan) {
        ModelDosen.dosen.add(new NodeDosen (nip, nama, alamat, NoTelp, jurusan)); }

    public void setJur(String nama, int newJurusan) {
        for (int i = 0; i < dosen.size(); i++) {
            if (nama.equals(dosen.get(i).getNama())) {
                dosen.get(i).setJurusan(User.jurusan.searchJurusan(newJurusan));
            }
        }
    }
    public void viewAllDosen() {
        for (int i = 0; i < dosen.size(); i++) {
            ModelDosen.dosen.get(i).viewDosen();
            System.out.println(" ---------------");
        }
    }
    
    public void viewDosenByNip(int nip){
        for (int i = 0; i<dosen.size();i++){
            if (nip == dosen.get(i).getNip_Dosen()){
                dosen.get(i).viewDosen();
            }
        }
    }
    
    public void updateDosen(int nip, NodeJurusan newJurusan) {
        for (int i = 0; i < dosen.size(); i++) {
            if (nip == dosen.get(i).getNip_Dosen()) {
                dosen.get(i).setJurusan(newJurusan);
            }
        }
    }

    public void deleteDosen(int nip) {
        for (int i = 0; i < dosen.size(); i++) {
            if (nip==dosen.get(i).getNip_Dosen()) {
                dosen.remove(i);
                System.out.println("Data berhasil dihapus");
            }
        }
    }
    
    public NodeDosen searchDosen(int kode){
        for (int i = 0; i < dosen.size(); i++) {
           if (kode==dosen.get(i).getNip_Dosen()) {
               return dosen.get(i);
           }
       }
       return null;
   }

}

