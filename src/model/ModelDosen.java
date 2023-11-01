package model;

import java.util.ArrayList;

import controller.User;
import node.NodeDosen;
import node.NodeJurusan;

public class ModelDosen {
    ArrayList<NodeDosen> dosen;

    public ModelDosen() {
        this.dosen = new ArrayList<>();
    }

public void insertDosen (int nip, String nama, String alamat, String NoTelp, NodeJurusan jurusan) {
    this.dosen.add(new NodeDosen (nip, nama, alamat, NoTelp, jurusan)); }

    public void viewAllDosen() {
        for (int i = 0; i < dosen.size(); i++) {
            this.dosen.get(i).viewDosen();
            System.out.println(" ---------------");
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



    public void viewDosenByNip(int nip){
        for (int i = 0; i<dosen.size();i++){
            if (nip == dosen.get(i).getNip_Dosen()){
                dosen.get(i).viewDosen();
            }
        }
    }

    
    public void updateDosen(int nip,String newNama, String newAlamat, String newTelp,String newJurusan) {
        for (int i = 0; i < dosen.size(); i++) {
            if (nip == dosen.get(i).getNip_Dosen()) {
                if (!newNama.equals("-")) {
                    dosen.get(i).setNama(newNama);
                }
                if (!newAlamat.equals("-")) {
                    dosen.get(i).setAlamat(newAlamat);
                }
                if (!newTelp.equals("-")) {
                    dosen.get(i).setNoTelp(newTelp);
                }
                if (!newJurusan.equals("-")){
                    dosen.get(i).setJurusan(User.jurusan.getJurusan(Integer.valueOf(newJurusan)));
                }
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

    public void setJur(String nama, int newJurusan) {
        for (int i = 0; i < dosen.size(); i++) {
            if (nama.equals(dosen.get(i).getNama())) {
                dosen.get(i).setJurusan(User.jurusan.getJurusan(newJurusan));
            }
        }
    }
}

