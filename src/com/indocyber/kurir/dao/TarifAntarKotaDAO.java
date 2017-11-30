/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indocyber.kurir.dao;

import com.indocyber.kurir.model.CostDelivery;
import com.indocyber.kurir.model.DataKotaProvinsi;
import com.indocyber.kurir.model.DataPaket;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class TarifAntarKotaDAO {
    
    public DataPaket findKota(String kota){
        DataPaket city = new DataPaket();
        try {
            Scanner sc;
            sc = new Scanner(new File("C:\\Users\\user\\Documents\\NetBeansProjects\\KurirApps\\dataTarifAwal.txt")); 
            
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                String[] data = line.split(",");
                if(data[0].equalsIgnoreCase(kota)){
                    city.setKotaAsal(data[0]);
                    city.setDestinasi(data[1]);
                    break;
                }
                
            }
        } 
        catch (FileNotFoundException fileErr) {
            fileErr.printStackTrace();
        }return city;
    }
    public static List<DataPaket> getKotaList(){
        List<DataPaket> kotaList = new ArrayList<>();
        try {
            Scanner sc;
            sc = new Scanner(new File("C:\\Users\\user\\Documents\\NetBeansProjects\\KurirApps\\dataTarifAwal.txt")); 
            
            while (sc.hasNextLine()){
                DataPaket kp = new DataPaket();
            String line = sc.nextLine();
                String[] data = line.split(",");
                    kp.setKotaAsal(data[0]);
                    kp.setDestinasi(data[1]);
                    kp.setTarif(Double.parseDouble(data[2].trim()));
                    
                    kotaList.add(kp);
                
            }
        } 
        catch (FileNotFoundException fileErr) {
            fileErr.printStackTrace();
        }
        return kotaList;
    }

    
    

}
