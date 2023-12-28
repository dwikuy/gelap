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

public class SistemPendaftaranEventMusik {
    private ArrayList<PendaftaranEventMusik> daftarPendaftaran;

    public SistemPendaftaranEventMusik() {
        this.daftarPendaftaran = new ArrayList<>();
    }

    public void addPendaftaran(PendaftaranEventMusik pendaftaran) {
        daftarPendaftaran.add(pendaftaran);
    }

    public ArrayList<PendaftaranEventMusik> getDaftarPendaftaran() {
        return daftarPendaftaran;
    }
}
