package model;
import java.time.LocalDate;
import java.util.ArrayList;

import node.NodeMahasiswa;
import node.NodePembayaran;
public class ModelPembayaran {
    public static ArrayList<NodePembayaran> pembayaran = new ArrayList<>();

    public ModelPembayaran() {
        ModelPembayaran.pembayaran= new ArrayList<>();
    }

    public void insertPembayaran(LocalDate time, NodeMahasiswa mahasiswa, String kasir ){
        ModelPembayaran.pembayaran.add(new NodePembayaran(mahasiswa, kasir, time)); 
    }
    
    public void viewAllPembayaran(String npm){
        for (int i = 0; i<pembayaran.size();i++){
                pembayaran.get(i).view();
            }
        }
    }

