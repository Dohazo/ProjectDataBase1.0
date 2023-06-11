package com.example.projectdatabase;

import java.time.LocalDate;
import java.util.Date;

public class NamaMovie {
    private String id_movie;
    private String id_lisensor;
    private String kode_jadwal;
    private String judul;
    private int durasi;
    private String genre;
    private LocalDate tahun_produksi;
    private String sutradara;
    private String dimensi;

    public NamaMovie(String id_movie, String id_lisensor, String kode_jadwal, String judul, int durasi, String genre, LocalDate tahun_produksi, String sutradara, String dimensi) {
        this.id_movie = id_movie;
        this.id_lisensor = id_lisensor;
        this.kode_jadwal = kode_jadwal;
        this.judul = judul;
        this.durasi = durasi;
        this.genre = genre;
        this.tahun_produksi = tahun_produksi;
        this.sutradara = sutradara;
        this.dimensi = dimensi;
    }

    public String getId_movie() {
        return id_movie;
    }

    public void setId_movie(String id_movie) {
        this.id_movie = id_movie;
    }

    public String getId_lisensor() {
        return id_lisensor;
    }

    public void setId_lisensor(String id_lisensor) {
        this.id_lisensor = id_lisensor;
    }

    public String getKode_jadwal() {
        return kode_jadwal;
    }

    public void setKode_jadwal(String kode_jadwal) {
        this.kode_jadwal = kode_jadwal;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDate getTahun_produksi() {
        return tahun_produksi;
    }

    public void setTahun_produksi(LocalDate tahun_produksi) {
        this.tahun_produksi = tahun_produksi;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public String getDimensi() {
        return dimensi;
    }

    public void setDimensi(String dimensi) {
        this.dimensi = dimensi;
    }
}
