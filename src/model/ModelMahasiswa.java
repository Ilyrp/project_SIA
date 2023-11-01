package model;
import java.util.ArrayList;

import node.NodeJurusan;
import node.NodeMahasiswa;
import model.ModelJurusan;

public class ModelMahasiswa {
    String indexNpm = "00000";
    ArrayList<NodeMahasiswa> Students;

    public ModelMahasiswa() {
        this.Students = new ArrayList<>();
    }
    public void insertMahasiswa (String nama, String kewarganegaraan, String telp, boolean her) {
        this.Students.add(new NodeMahasiswa(nama, kewarganegaraan, telp, her)); 
    }

    public void viewAllMahasiswa() {
        for (int i = 0; i < Students.size(); i++) {
            this.Students.get(i).viewMahasiswa();
            System.out.println(" -");
        }
    }
    public void updateHer (String nama, boolean her){
         for (int i = 0; i <Students.size();i++){
            if (nama.equals(Students.get(i).getNama_Mahasiswa())){
                Students.get(i).setHer(her);
            }
        }
    }
    public void updateNpm (String nama){
        for (int i = 0; i <Students.size();i++){
            if (nama.equals(Students.get(i).getNama_Mahasiswa())){
                indexNpm +="1";
                Students.get(i).setNpm(indexNpm);
            }
        }
    }

public void updateNotelp (String nama, String telp){
     for (int i = 0; i <Students.size();i++){
        if (nama.equals(Students.get(i).getNama_Mahasiswa())){
            Students.get(i).setNoTelpMahasiswa(telp);
        }
    }
}

    public void deleteMahasiswa(String nama) {
        for (int i = 0; i < Students.size(); i++) {
            if (nama.equals(Students.get(i).getNama_Mahasiswa())) {
                Students.remove(i);
            }
        }
    }

    // public void setJur(String nama, NodeJurusan jurusan){
    //     for (int i = 0; i < Students.size(); i++) {
    //         if (nama.equals(Students.get(i).getNama_Mahasiswa())) {
    //             Students.get(i).setJurusan(jurusan);
    //         }
    //     }
    // }

}
