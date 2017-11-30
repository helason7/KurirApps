/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indocyber.kurir.model;

/**
 *
 * @author user
 */
public class DataKotaProvinsi {
    private String kota;
    private String provinsi;

    public DataKotaProvinsi() {
    }

    public DataKotaProvinsi(String kota, String provinsi) {
        this.kota = kota;
        this.provinsi = provinsi;
    }

    
    /**
     * @return the kota
     */
    public String getKota() {
        return kota;
    }

    /**
     * @param kota the kota to set
     */
    public void setKota(String kota) {
        this.kota = kota;
    }

    /**
     * @return the provinsi
     */
    public String getProvinsi() {
        return provinsi;
    }

    /**
     * @param provinsi the provinsi to set
     */
    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }
}
