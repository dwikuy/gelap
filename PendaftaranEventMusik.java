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
import java.util.ArrayList;

public class PendaftaranEventMusik implements Pendaftaran {
    private EventMusik event;
    private ArrayList<String> daftarPeserta;

    public PendaftaranEventMusik(EventMusik event) {
        this.event = event;
        this.daftarPeserta = new ArrayList<>();
    }

    @Override
    public void daftarPeserta(String nama, int umur) {
        daftarPeserta.add(nama + " (" + umur + " tahun)");
    }

    @Override
    public void tampilkanDaftarPeserta() {
        System.out.println("Daftar Peserta untuk " + event.getNamaEvent() + ":");
        for (String peserta : daftarPeserta) {
            System.out.println(peserta);
        }
    }

    // Getters and Setters
    public EventMusik getEvent() {
        return event;
    }

    public void setEvent(EventMusik event) {
        this.event = event;
    }
}
