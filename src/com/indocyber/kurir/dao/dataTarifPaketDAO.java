/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indocyber.kurir.dao;

import com.indocyber.kurir.model.DataPaket;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class dataTarifPaketDAO {
    
    public DataPaket findPaket(String paket){
        DataPaket pack = new DataPaket();
        try {
            Scanner sc;
            sc = new Scanner(new File("C:\\Users\\user\\Documents\\NetBeansProjects\\KurirApps\\dataTarifPaket.txt")); 
            
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                String[] data = line.split(",");
                if(data[0].equalsIgnoreCase(paket)){
                    pack.setJenisLayanan(data[0]);
                    pack.setTarifPaket(Double.parseDouble(data[1].trim()));;
                    break;
                }
                
            }
        } 
        catch (FileNotFoundException fileErr) {
            fileErr.printStackTrace();
        }return pack;
    }
    public static List<DataPaket> getPaketList(){
        List<DataPaket> packList = new ArrayList<>();
        try {
            Scanner sc;
            sc = new Scanner(new File("C:\\Users\\user\\Documents\\NetBeansProjects\\KurirApps\\dataTarifPaket.txt")); 
            
            while (sc.hasNextLine()){
                DataPaket pack = new DataPaket();
                String line = sc.nextLine();
                String[] data = line.split(",");
                    pack.setJenisLayanan(data[0]);
                    pack.setTarifPaket(Double.parseDouble(data[1].trim()));;
                    
                    packList.add(pack);
                
            }
        } 
        catch (FileNotFoundException fileErr) {
            fileErr.printStackTrace();
        }
        return packList;
    }
    

}
