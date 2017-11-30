/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indocyber.kurir.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Provinsi {
    private String namaProvinsi;
    private List<Kota> kota = new ArrayList<>();

    /**
     * @return the namaProvinsi
     */
    public String getNamaProvinsi() {
        return namaProvinsi;
    }

    /**
     * @param namaProvinsi the namaProvinsi to set
     */
    public void setNamaProvinsi(String namaProvinsi) {
        this.namaProvinsi = namaProvinsi;
    }

    /**
     * @return the kota
     */
    public List<Kota> getKota() {
        return kota;
    }

    /**
     * @param kota the kota to set
     */
    public void setKota(List<Kota> kota) {
        this.kota = kota;
    }

    @Override
    public String toString() {
        return namaProvinsi;
    }
    
    
    
}
