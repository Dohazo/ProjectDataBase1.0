package com.example.projectdatabase;

import java.time.LocalTime;
import java.util.Date;

public class Jadwal {
    private String kodeJadwal;
    private LocalTime jamMulai;

    public String getKodeJadwal() {
        return kodeJadwal;
    }

    public void setKodeJadwal(String kodeJadwal) {
        this.kodeJadwal = kodeJadwal;
    }

    public LocalTime getJam() {
        return jamMulai;
    }

    public void setJam(LocalTime jam) {
        this.jamMulai = jam;
    }

    public Jadwal(String kodeJadwal, LocalTime jam) {
        this.kodeJadwal = kodeJadwal;
        this.jamMulai = jam;
    }
}
