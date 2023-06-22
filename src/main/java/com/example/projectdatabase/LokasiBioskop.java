package com.example.projectdatabase;

public class LokasiBioskop {
    String id_bioskop;
    String tempat;
    String alamat;

    public LokasiBioskop(String id_bioskop, String tempat, String alamat) {
        this.id_bioskop = id_bioskop;
        this.tempat = tempat;
        this.alamat = alamat;
    }

    public String getId_bioskop() {
        return id_bioskop;
    }

    public void setId_bioskop(String id_bioskop) {
        this.id_bioskop = id_bioskop;
    }

    public String getTempat() {
        return tempat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
