package model;

import java.util.ArrayList;
import node.NodeDoswal;

public class ModelDoswal {
    ArrayList<NodeDoswal> dosWal;

    public ModelDoswal() {
        this.dosWal = new ArrayList<>();
    }

public void insertJurusan (String nama, String fakultas) {
    int index = dosWal.size();
    this.dosWal.add(new NodeDoswal (index+1, nama, fakultas)); }

    public void viewAllJurusan() {
        for (int i = 0; i < dosWal.size(); i++) {
            this.dosWal.get(i).viewJurusan();
            System.out.println(" -");
        }
    }

public void updateJurusan (String nama_jurusan, String new_fakultas){
     for (int i = 0; i <dosWal.size();i++){
        if (nama_jurusan.equals(dosWal.get(i).getNama_jurusan())){
            dosWal.get(i).setNama_fakultas (new_fakultas);
        }
    }
}

    public void deleteJurusan(String nama_jurusan) {
        for (int i = 0; i < dosWal.size(); i++) {
            if (nama_jurusan.equals(dosWal.get(i).getNama_jurusan())) {
                dosWal.remove(i);
            }
        }
    }
}
