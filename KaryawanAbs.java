/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




/**
 *
 * @author D E R I
 */
public abstract class KaryawanAbs {
    String idKaryawan, nama, posisi, jenisKelamin, alamat, gaji, potongan;

    abstract void inputDataKaryawan(String idKaryawan);

    abstract void inputNama(String nama);

    abstract void inputPosisi(String posisi);

    abstract void inputJenisKelamin(String jenisKelamin);

    abstract void inputAlamat(String alamat);

    abstract void inputGaji(String gaji);
    
     abstract void inputPotongan(String potongan);

    // Overloading metode inputPosisi dengan parameter tambahan gaji
    abstract void inputPosisi(String posisi, double gaji);

    abstract String tampilkanIdKaryawan();

    abstract String tampilkanNama();

    abstract String tampilkanPosisi();

    abstract String tampilkanJenisKelamin();

    abstract String tampilkanAlamat();

    abstract String tampilkanGaji();
     abstract String tampilkanPotongan();
}
