/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftaraneventmusikapp;

/**
 *
 * @author PCL-B00-00
 */
public class EventMusik {
    private String namaEvent;
    private String tanggal;
    private double hargaTiket;

    public EventMusik(String namaEvent, String tanggal, double hargaTiket) {
        this.namaEvent = namaEvent;
        this.tanggal = tanggal;
        this.hargaTiket = hargaTiket;
    }

    public String getInfo() {
        return "\nNama Event: " + namaEvent + "\nTanggal: " + tanggal + "\nHarga Tiket: " + hargaTiket;
    }

    // Getters
    public String getNamaEvent() {
        return namaEvent;
    }

    public String getTanggal() {
        return tanggal;
    }

    public double getHargaTiket() {
        return hargaTiket;
    }

    // Setters
    public void setNamaEvent(String namaEvent) {
        this.namaEvent = namaEvent;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void setHargaTiket(double hargaTiket) {
        this.hargaTiket = hargaTiket;
    }
}
