package model;
import java.util.ArrayList;

import controller.User;
import node.NodeDosen;
import node.NodeJurusan;
// import node.NodeJurusan;
import node.NodeMahasiswa;
// import model.ModelJurusan;

public class ModelMahasiswa {
    int lastIndex = 1;
    public static ArrayList<NodeMahasiswa> Students;

    public ModelMahasiswa() {
        Students = new ArrayList<>();
    }
    public void insertMahasiswa (String nama, String alamat, String telp,String namaWali, String alamatWali, String telpWali, NodeJurusan jurusan) {
        ModelMahasiswa.Students.add(new NodeMahasiswa(nama, alamat, telp,namaWali,alamatWali,telpWali, jurusan)); 
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

    public void viewMahasiswaByNpm(String npm){
        for (int i = 0; i<Students.size();i++){
            if (npm.equals(Students.get(i).getNpm_Mahasiswa())){
                System.out.println("Found matching npm: " + npm);
                Students.get(i).viewMahasiswa();
            }
        }
    }

    public void viewAllMahasiswa() {
        for (int i = 0; i < Students.size(); i++) {
            Students.get(i).viewMahasiswa();
            System.out.println(" -----------------");
        }
    }

    public void updateNpm (String nama){
        String indexNpm = String.format("%04d", lastIndex);
        for (int i = 0; i <Students.size();i++){
            if (nama.equals(Students.get(i).getNama())){
                lastIndex++;
                Students.get(i).setNpm(indexNpm);
            }
        }
    }

    public void updateJurusan(String npm, int newJurusan) {
        for (int i = 0; i < Students.size(); i++) {
            if (npm.equals(Students.get(i).getNpm_Mahasiswa())) {
                Students.get(i).setJurusan(User.jurusan.searchJurusan(newJurusan));
            }
        }
    }

    public void updateNotelp(String npm, String newTelp) {
        for (int i = 0; i < Students.size(); i++) {
            if (npm.equals(Students.get(i).getNpm_Mahasiswa())) {
                Students.get(i).setNoTelp(newTelp);
            }
        }
    }

    public void updateAlamat(String npm, String alamat) {
        for (int i = 0; i < Students.size(); i++) {
            if (npm.equals(Students.get(i).getNpm_Mahasiswa())) {
                Students.get(i).setAlamat(alamat);
            }
        }
    }

    public void deleteMahasiswa(String nama) {
        for (int i = 0; i < Students.size(); i++) {
            if (nama.equals(ModelMahasiswa.Students.get(i).getNama())) {
                ModelMahasiswa.Students.remove(i);
                System.out.println("Data Mahasiswa " + nama + " berhasil dihapus");
            }
        }
    }

    public NodeMahasiswa searchMahasiswa(String nama){
        for (int i = 0; i < Students.size(); i++) {
            if (nama.equals(Students.get(i).getNama())) {
                return Students.get(i);
            }
        }
        return null;
    }

}
