/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */





/**
 *
 * @author D E R I
 */
public class KaryawanTetap extends KaryawanAbs {
    double gajiTetap;

    @Override
    void inputDataKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    @Override
    void inputNama(String nama) {
        this.nama = nama;
    }

    @Override
    void inputPosisi(String posisi) {
        this.posisi = posisi;
        this.gajiTetap = 5000000; // Contoh gaji tetap
    }

    @Override
    void inputJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    @Override
    void inputAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    void inputGaji(String gaji) {
        this.gaji = gaji;
    }

    @Override
    void inputPosisi(String posisi, double gaji) {
        this.posisi = posisi;
        this.gajiTetap = gaji;
    }

    @Override
    void inputPotongan(String potongan) {
        this.potongan = potongan;
    }

    @Override
    String tampilkanIdKaryawan() {
        return idKaryawan;
    }

    @Override
    String tampilkanNama() {
        return nama;
    }

    @Override
    String tampilkanPosisi() {
        return "Posisi: " + posisi + ", Gaji Tetap: " + gajiTetap;
    }

    @Override
    String tampilkanJenisKelamin() {
        return jenisKelamin;
    }

    @Override
    String tampilkanAlamat() {
        return alamat;
    }

    @Override
    String tampilkanGaji() {
        return gaji;
    }

    @Override
    String tampilkanPotongan() {
        return potongan;
    }
}

