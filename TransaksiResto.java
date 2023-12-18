/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




/**
 *
 * @author D E R I
 */
public class TransaksiResto {
    private String namaBarang;
    private double harga;
    private int jumlah;

    public TransaksiResto(String namaBarang, double harga, int jumlah) {
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public double hitungTotal() {
        return harga * jumlah;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void tampilkanTransaksi() {
        System.out.println("Nama Barang: " + getNamaBarang());
        System.out.println("Harga per Unit: " + getHarga());
        System.out.println("Jumlah: " + getJumlah());
        System.out.println("Total Harga: " + hitungTotal());
    }
}

