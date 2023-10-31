package model;
import java.util.ArrayList;
import node.NodeMahasiswa;

public class ModelMahasiswa {
     ArrayList<NodeMahasiswa> Students;

    public ModelMahasiswa() {
        this.Students = new ArrayList<>();
    }

public void insertMahasiswa (String nama, String kewarganegaraan, String telp) {
    this.Students.add(new NodeMahasiswa(nama, kewarganegaraan, telp)); }

    public void viewAllMahasiswa() {
        for (int i = 0; i < Students.size(); i++) {
            this.Students.get(i).viewMahasiswa();
            System.out.println(" -");
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
}
