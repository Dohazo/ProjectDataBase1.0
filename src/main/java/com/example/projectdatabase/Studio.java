package com.example.projectdatabase;

public class Studio {
    String kodeStudio;
    String idBioskop;
    int jumlahKursi;

    public Studio(String kodeStudio, String idBioskop, int jumlahKursi) {
        this.kodeStudio = kodeStudio;
        this.idBioskop = idBioskop;
        this.jumlahKursi = jumlahKursi;
    }

    public String getKodeStudio() {
        return kodeStudio;
    }

    public void setKodeStudio(String kodeStudio) {
        this.kodeStudio = kodeStudio;
    }

    public String getIdBioskop() {
        return idBioskop;
    }

    public void setIdBioskop(String idBioskop) {
        this.idBioskop = idBioskop;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }
}
