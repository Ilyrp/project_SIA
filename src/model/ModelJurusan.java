package model;

import node.NodeJurusan;
import java.util.ArrayList;

public class ModelJurusan {
    ArrayList<NodeJurusan> departmens;

    public ModelJurusan() {
        this.departmens = new ArrayList<>();
    }

public void insertJurusan (String nama, String fakultas) {
    int index = departmens.size();
    this.departmens.add(new NodeJurusan (index+1, nama, fakultas)); }

    public void viewAllJurusan() {
        for (int i = 0; i < departmens.size(); i++) {
            this.departmens.get(i).viewJurusan();
            System.out.println(" -");
        }
    }

public void updateJurusan (String nama_jurusan, String new_fakultas){
     for (int i = 0; i <departmens.size();i++){
        if (nama_jurusan.equals(departmens.get(i).getNama_jurusan())){
            departmens.get(i).setNama_fakultas (new_fakultas);
        }
    }
}

    public void deleteJurusan(String nama_jurusan) {
        for (int i = 0; i < departmens.size(); i++) {
            if (nama_jurusan.equals(departmens.get(i).getNama_jurusan())) {
                departmens.remove(i);
            }
        }
    }

    public String searchJurusan(String nama_jurusan){
         for (int i = 0; i < departmens.size(); i++) {
            if (nama_jurusan.equals(departmens.get(i).getNama_jurusan())) {
                return departmens.get(i).getNama_jurusan();
            }
        }
        return nama_jurusan;
    }
}