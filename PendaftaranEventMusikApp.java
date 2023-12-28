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
import java.util.Scanner;

public class PendaftaranEventMusikApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemPendaftaranEventMusik sistem = new SistemPendaftaranEventMusik();

        // Contoh inisialisasi Event Musik
        EventMusik event1 = new EventMusik("Rock Fest", "2023-08-12", 150000);
        PendaftaranEventMusik pendaftaran1 = new PendaftaranEventMusik(event1);
        sistem.addPendaftaran(pendaftaran1);

        // Loop untuk menjalankan program
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nMenu Utama:");
            System.out.println("1. Lihat Daftar Event Musik");
            System.out.println("2. Daftar Event Musik");
            System.out.println("3. Lihat Daftar Pendaftaran dan Peserta");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    // Menampilkan daftar event musik
                    for (PendaftaranEventMusik p : sistem.getDaftarPendaftaran()) {
                        System.out.println(p.getEvent().getInfo());
                    }
                    break;
                case 2:
                    // Mendaftarkan peserta ke event musik
                    System.out.println("Pilih Event Musik:");
                    int index = 1;
                    for (PendaftaranEventMusik p : sistem.getDaftarPendaftaran()) {
                        System.out.println(index++ + ". " + p.getEvent().getNamaEvent());
                    }
                    System.out.print("Pilih nomor event: ");
                    int pilihanEvent = scanner.nextInt();
                    PendaftaranEventMusik pilihanPendaftaran = sistem.getDaftarPendaftaran().get(pilihanEvent - 1);
                    
                    System.out.print("Masukkan nama: ");
                    scanner.nextLine(); // Membersihkan buffer
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan umur: ");
                    int umur = scanner.nextInt();
                    pilihanPendaftaran.daftarPeserta(nama, umur);
                    System.out.println("Peserta telah didaftarkan!");
                    break;
                case 3:
                    // Menampilkan daftar pendaftaran dan peserta
                    for (PendaftaranEventMusik p : sistem.getDaftarPendaftaran()) {
                        p.tampilkanDaftarPeserta();
                    }
                    break;
                case 4:
                    // Keluar dari program
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }
}
