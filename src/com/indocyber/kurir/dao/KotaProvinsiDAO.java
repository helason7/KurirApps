/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indocyber.kurir.dao;

import com.indocyber.kurir.model.DataKotaProvinsi;
import com.indocyber.kurir.model.Kota;
import com.indocyber.kurir.model.Provinsi;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class KotaProvinsiDAO {

    public DataKotaProvinsi findKotaProvinsi(String kopi) {
        DataKotaProvinsi kp = new DataKotaProvinsi();
        try {
            Scanner sc;
            sc = new Scanner(new File("C:\\Users\\user\\Documents\\NetBeansProjects\\KurirApps\\dataProvinsi.txt"));

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] data = line.split(",");
                if (data[0].equalsIgnoreCase(kopi)) {
                    kp.setProvinsi(data[0]);
                    kp.setKota(data[1]);
                    break;
                }

            }
        } catch (FileNotFoundException fileErr) {
            fileErr.printStackTrace();
        }
        return kp;
    }

    public static List<Provinsi> getKotaProvinsi() {
        List<Provinsi> provinsis = new ArrayList<>();
        Provinsi provinsiDKI = new Provinsi();
        Provinsi provinsiBandung = new Provinsi();
        Provinsi provinsiJawaTimur = new Provinsi();

        List<Kota> kotaDKI = new ArrayList<>();
        List<Kota> kotaBandung = new ArrayList<>();
        List<Kota> kotaJatim = new ArrayList<>();

        try {
            Scanner sc;
            sc = new Scanner(new File("C:\\Users\\user\\Documents\\NetBeansProjects\\KurirApps\\dataProvinsi.txt"));

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] data = line.split(",");

                if(data[0].equalsIgnoreCase("DKI JAKARTA")){
                    Kota kota = new Kota();
                    kota.setNamaKota(data[1].trim());
                    kotaDKI.add(kota);
                }
                
                if(data[0].equalsIgnoreCase("BANDUNG")){
                    Kota kota = new Kota();
                    kota.setNamaKota(data[1].trim());
                    kotaBandung.add(kota);
                }
                
                if(data[0].equalsIgnoreCase("JAWA TIMUR")){
                    Kota kota = new Kota();
                    kota.setNamaKota(data[1].trim());
                    kotaJatim.add(kota);
                }


            }
            provinsiDKI.setNamaProvinsi("DKI JAKARTA");
            provinsiDKI.setKota(kotaDKI);

            provinsiBandung.setNamaProvinsi("BANDUNG");
            provinsiBandung.setKota(kotaBandung);
            
            provinsiJawaTimur.setNamaProvinsi("JAWA TIMUR");
            provinsiJawaTimur.setKota(kotaJatim);
            
            provinsis.add(provinsiDKI);
            provinsis.add(provinsiBandung);
            provinsis.add(provinsiJawaTimur);
        } catch (FileNotFoundException fileErr) {
            fileErr.printStackTrace();
        }
        return provinsis;
    }
}
