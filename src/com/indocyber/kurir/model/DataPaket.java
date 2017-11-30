/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indocyber.kurir.model;

import java.util.Date;

/**
 *
 * @author user
 */
public class DataPaket {
    private char noPaket;
    private double tarif;
    private String kotaAsal;
    private String destinasi;
    private String jenisBarang;
    private Date   tglKirim;
    private double panjang;
    private double lebar;
    private double tinggi;
    private double dimensiUkuran;
    private String jenisLayanan;
    private boolean asuransi;
    private double hargaBarang;
    private String pembayaran;
    private double tarifPaket;

    public DataPaket() {
    }

    public DataPaket(char noPaket, double tarif, String kotaAsal, String destinasi, String jenisBarang, Date tglKirim, double panjang, double lebar, double tinggi, double dimensiUkuran, String jenisLayanan, boolean asuransi, double hargaBarang, String pembayaran) {
        this.noPaket = noPaket;
        this.tarif = tarif;
        this.kotaAsal = kotaAsal;
        this.destinasi = destinasi;
        this.jenisBarang = jenisBarang;
        this.tglKirim = tglKirim;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.dimensiUkuran = dimensiUkuran;
        this.jenisLayanan = jenisLayanan;
        this.asuransi = asuransi;
        this.hargaBarang = hargaBarang;
        this.pembayaran = pembayaran;
    }

    
    /**
     * @return the noPaket
     */
    public char getNoPaket() {
        return noPaket;
    }

    /**
     * @param noPaket the noPaket to set
     */
    public void setNoPaket(char noPaket) {
        this.noPaket = noPaket;
    }

    /**
     * @return the tarif
     */
    public double getTarif() {
        return tarif;
    }

    /**
     * @param tarif the tarif to set
     */
    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    /**
     * @return the kotaAsal
     */
    public String getKotaAsal() {
        return kotaAsal;
    }

    /**
     * @param kotaAsal the kotaAsal to set
     */
    public void setKotaAsal(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    /**
     * @return the destinasi
     */
    public String getDestinasi() {
        return destinasi;
    }

    /**
     * @param destinasi the destinasi to set
     */
    public void setDestinasi(String destinasi) {
        this.destinasi = destinasi;
    }

    /**
     * @return the jenisBarang
     */
    public String getJenisBarang() {
        return jenisBarang;
    }

    /**
     * @param jenisBarang the jenisBarang to set
     */
    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    /**
     * @return the tglKirim
     */
    public Date getTglKirim() {
        return tglKirim;
    }

    /**
     * @param tglKirim the tglKirim to set
     */
    public void setTglKirim(Date tglKirim) {
        this.tglKirim = tglKirim;
    }

    /**
     * @return the panjang
     */
    public double getPanjang() {
        return panjang;
    }

    /**
     * @param panjang the panjang to set
     */
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    /**
     * @return the lebar
     */
    public double getLebar() {
        return lebar;
    }

    /**
     * @param lebar the lebar to set
     */
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    /**
     * @return the tinggi
     */
    public double getTinggi() {
        return tinggi;
    }

    /**
     * @param tinggi the tinggi to set
     */
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    /**
     * @return the dimensiUkuran
     */
    public double getDimensiUkuran() {
        return dimensiUkuran;
    }

    /**
     * @param dimensiUkuran the dimensiUkuran to set
     */
    public void setDimensiUkuran(double dimensiUkuran) {
        this.dimensiUkuran = dimensiUkuran;
    }

    /**
     * @return the jenisLayanan
     */
    public String getJenisLayanan() {
        return jenisLayanan;
    }

    /**
     * @param jenisLayanan the jenisLayanan to set
     */
    public void setJenisLayanan(String jenisLayanan) {
        this.jenisLayanan = jenisLayanan;
    }

    /**
     * @return the asuransi
     */
    public boolean isAsuransi() {
        return asuransi;
    }

    /**
     * @param asuransi the asuransi to set
     */
    public void setAsuransi(boolean asuransi) {
        this.asuransi = asuransi;
    }

    /**
     * @return the hargaBarang
     */
    public double getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @param hargaBarang the hargaBarang to set
     */
    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    /**
     * @return the pembayaran
     */
    public String getPembayaran() {
        return pembayaran;
    }

    /**
     * @param pembayaran the pembayaran to set
     */
    public void setPembayaran(String pembayaran) {
        this.pembayaran = pembayaran;
    }

    /**
     * @return the tarifPaket
     */
    public double getTarifPaket() {
        return tarifPaket;
    }

    /**
     * @param tarifPaket the tarifPaket to set
     */
    public void setTarifPaket(double tarifPaket) {
        this.tarifPaket = tarifPaket;
    }

    @Override
    public String toString() {
        return this.kotaAsal;
    }
    
    
}
