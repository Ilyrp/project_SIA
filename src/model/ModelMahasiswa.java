package model;
import java.util.ArrayList;

import controller.User;
import node.NodeDosen;
import node.NodeJurusan;
// import node.NodeJurusan;
import node.NodeMahasiswa;
// import model.ModelJurusan;

public class ModelMahasiswa {
    int lastIndex = 0;
    String indexNpm = String.format("%04d", lastIndex);
    public static ArrayList<NodeMahasiswa> Students;

    public ModelMahasiswa() {
        ModelMahasiswa.Students = new ArrayList<>();
    }
    public void insertMahasiswa (String nama, String alamat, String telp,String namaWali, String alamatWali, String telpWali, NodeJurusan jurusan) {
        ModelMahasiswa.Students.add(new NodeMahasiswa(nama, alamat, telp,namaWali,alamatWali,telpWali, jurusan)); 
    }

    public void viewMahasiswaByNpm(String npm){
        for (int i = 0; i<Students.size();i++){
            if (npm.equals(Students.get(i).getNpm_Mahasiswa())){
                System.out.println("Found matching npm: " + npm);
                Students.get(i).viewMahasiswa();
            }
        }
    }

    public void viewMahasiswaByNama(String nama){
        for (int i = 0; i<Students.size();i++){
            if (nama.equals(Students.get(i).getNama())){
                System.out.println("Found matching Nama: " + nama);
                Students.get(i).viewMahasiswa();
            }
        }
    }


    public void viewAllMahasiswa() {
        for (int i = 0; i < Students.size(); i++) {
            ModelMahasiswa.Students.get(i).viewMahasiswa();
            System.out.println(" -----------------");
        }
    }

    // public void updateNpm (String nama){
    //     for (int i = 0; i <Students.size();i++){
    //         if (nama.equals(Students.get(i).getNama())){
    //             indexNpm +=1;
    //             Students.get(i).setNpm(indexNpm);
    //         }
    //     }
    // }

    public void updateNpm (String nama){
        int index = (Students.size());
        String indexNpm = String.format("%04d", index);
        for (int i = 0; i <Students.size();i++){
            if (nama.equals(Students.get(i).getNama())){
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

    public NodeMahasiswa searchMahasiswa(String nama){
        for (int i = 0; i < Students.size(); i++) {
            if (nama.equals(Students.get(i).getNama())) {
                return Students.get(i);
            }
        }
        return null;
    }

    public void deleteMahasiswa(String nama) {
    ArrayList<NodeMahasiswa> mahasiswaToDelete = new ArrayList<>();

    for (NodeMahasiswa mahasiswa : Students) {
        if (nama.equalsIgnoreCase(mahasiswa.getNama())) {
            mahasiswaToDelete.add(mahasiswa);
        }
    }

    Students.removeAll(mahasiswaToDelete);
}


    public void updateMahasiswa(String npm,String newNama, String newAlamat, String newTelp,String newJurusan) {
        for (int i = 0; i < Students.size(); i++) {
            if (npm.equals(Students.get(i).getNpm_Mahasiswa())) {
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
                    Students.get(i).setJurusan(User.jurusan.getJurusan((Integer.valueOf(newJurusan))));
                }
            }
        }
    }

    public void setDoswal(String nama, NodeDosen doswal) {
        for (int i = 0; i < Students.size(); i++) {
            if (nama.equals(Students.get(i).getNama())) {
                Students.get(i).setDoswal(doswal);
            }
        }
    }

    public void setJur(String nama, NodeJurusan jurusan) {
        for (int i = 0; i < Students.size(); i++) {
            if (nama.equals(Students.get(i).getNama())) {
                Students.get(i).setJurusan(jurusan);
            }
        }
    }

}
