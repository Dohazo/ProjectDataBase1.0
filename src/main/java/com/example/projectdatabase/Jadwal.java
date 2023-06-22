package com.example.projectdatabase;

public class Jadwal {
    private String kodeJadwal;
    private int jamMulai;

    public String getKodeJadwal() {
        return kodeJadwal;
    }

    public void setKodeJadwal(String kodeJadwal) {
        this.kodeJadwal = kodeJadwal;
    }

    public int getJam() {
        return jamMulai;
    }

    public void setJam(int jam) {
        this.jamMulai = jam;
    }

    public Jadwal(String kodeJadwal, int jam) {
        this.kodeJadwal = kodeJadwal;
        this.jamMulai = jam;
    }
}
