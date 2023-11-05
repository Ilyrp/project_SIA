package model;

import node.NodeJurusan;
import java.util.ArrayList;

public class ModelJurusan {
    public static ArrayList<NodeJurusan> departmens;

    public ModelJurusan() {
        ModelJurusan.departmens = new ArrayList<>();
    }

    public void insertJurusan (String nama, String fakultas) {
        int index = departmens.size();
        ModelJurusan.departmens.add(new NodeJurusan (index+1, nama, fakultas)); 
    }

    public void viewAllJurusan() {
        for (int i = 0; i < departmens.size(); i++) {
            ModelJurusan.departmens.get(i).viewJurusan();
            System.out.println(" --------------");
        }
    }

    public void updateJurusan (String nama_jurusan, String new_fakultas){
        for (int i = 0; i <departmens.size();i++){
            if (nama_jurusan.equals(departmens.get(i).getNama_jurusan())){
                departmens.get(i).setNama_fakultas (new_fakultas);
            }
        }
    }

    public void deleteJurusan(int kode) {
        for (int i = 0; i < departmens.size(); i++) {
            if (kode == departmens.get(i).getKode_jurusan()) {
                departmens.remove(i);
            }
        }
    }

    public NodeJurusan searchJurusan(int kode){
         for (int i = 0; i < departmens.size(); i++) {
            if (kode==departmens.get(i).getKode_jurusan()) {
                return departmens.get(i);
            }
        }
        return null;
    }

}