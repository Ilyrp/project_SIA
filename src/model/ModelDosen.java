package model;

import java.util.ArrayList;

import controller.User;
import node.NodeDosen;

public class ModelDosen {
    ArrayList<NodeDosen> dosen;

    public ModelDosen() {
        this.dosen = new ArrayList<>();
    }

public void insertDosen (int nip, String nama, String alamat, String NoTelp) {
    this.dosen.add(new NodeDosen (nip, nama, alamat, NoTelp)); }

    public void viewAllDosen() {
        for (int i = 0; i < dosen.size(); i++) {
            this.dosen.get(i).viewDosen();
            System.out.println(" ---------------");
        }
    }

// public void updateNoTelpdosen (String namadosen,String NoTelp){
//      for (int i = 0; i <dosen.size();i++){
//         if (namadosen.equals(dosen.get(i).getNama())){
            
//             dosen.get(i).setNoTelp(NoTelp);
//         }
//     }
// }

    public void deleteDosen(String namadosen) {
        for (int i = 0; i < dosen.size(); i++) {
            if (namadosen.equals(dosen.get(i).getNama())) {
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

    public void setJur(String nama, int newJurusan) {
        for (int i = 0; i < dosen.size(); i++) {
            if (nama.equals(dosen.get(i).getNama())) {
                dosen.get(i).setJurusan(User.jurusan.getJurusan(newJurusan));
            }
        }
    }
}

