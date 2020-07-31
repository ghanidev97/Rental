package com.example.rentalio.model;

public class Kendaraan {
    private int gambarKendaraan;
    private String namaKendaraan;

    public Kendaraan(int gambarKendaraan, String namaKendaraan){
        this.namaKendaraan = namaKendaraan;
        this.gambarKendaraan = gambarKendaraan;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public int getGambarKendaraan() {
        return gambarKendaraan;
    }
}
