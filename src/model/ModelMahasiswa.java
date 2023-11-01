package model;
import java.util.ArrayList;

import controller.User;
// import node.NodeJurusan;
import node.NodeMahasiswa;
// import model.ModelJurusan;

public class ModelMahasiswa {
    String indexNpm = "00000";
    ArrayList<NodeMahasiswa> Students;

    public ModelMahasiswa() {
        this.Students = new ArrayList<>();
    }
    public void insertMahasiswa (String nama, String alamat, String telp) {
        this.Students.add(new NodeMahasiswa(nama, alamat, telp)); 
    }

    public void viewMahasiswaBy(String npm){
        for (int i = 0; i<Students.size();i++){
            if (npm.equals(Students.get(i).getNpm_Mahasiswa())){
                Students.get(i).viewMahasiswa();
            }
        }
    }


    public void viewAllMahasiswa() {
        for (int i = 0; i < Students.size(); i++) {
            this.Students.get(i).viewMahasiswa();
            System.out.println(" -----------------");
        }
    }

    public void updateNpm (String nama){
        for (int i = 0; i <Students.size();i++){
            if (nama.equals(Students.get(i).getNama())){
                indexNpm +=1;
                Students.get(i).setNpm(indexNpm);
            }
        }
    }

// public void updateNotelp (String nama, String telp){
//      for (int i = 0; i <Students.size();i++){
//         if (nama.equals(Students.get(i).getNama())){
//             Students.get(i).setNoTelp(telp);
//         }
//     }
// }

    public void deleteMahasiswa(String nama) {
        for (int i = 0; i < Students.size(); i++) {
            if (nama.equals(Students.get(i).getNama())) {
                Students.remove(i);
            }
        }
    }

    public void updateMahasiswa(String npm,String newNama, String newAlamat, String newTelp,String newJurusan) {
        for (int i = 0; i < Students.size(); i++) {
            if (npm.equals(Students.get(i).getNama())) {
                if (!newNama.equals("-")) {
                    Students.get(i).setNama(newNama);
                }
                if (!newAlamat.equals("-")) {
                    Students.get(i).setAlamat(newAlamat);
                }
                if (!newTelp.equals("-")) {
                    Students.get(i).setNoTelp(newTelp);
                }
                if (!newJurusan.equals("-")){
                    Students.get(i).setJurusan(User.jurusan.getJurusan(newJurusan));
                }
            }
        }
    }


    public void setJur(String nama){
        for (int i = 0; i < Students.size(); i++) {
            if (nama.equals(Students.get(i).getNama())) {
                Students.get(i).setJurusan(User.jurusan.getJurusan(nama));
            }
        }
    }

}
