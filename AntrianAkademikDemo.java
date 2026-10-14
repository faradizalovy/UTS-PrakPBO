public class AntrianAkademikDemo {
    public static void main(String[] args) {
        AntrianAkademik layanan = new AntrianAkademik();

        System.out.println("=== PENGAMBILAN ANTRIAN ===");
        layanan.tambahMahasiswa("Andi");
        layanan.tambahMahasiswa("Budi");
        layanan.tambahMahasiswa("Citra");
        layanan.tambahMahasiswa("Dinda");

        System.out.println("\n=== PEMANGGILAN DUA MAHASISWA ===");
        layanan.panggilMahasiswa();
        layanan.panggilMahasiswa();

        layanan.tampilkanSisaAntrian();

        System.out.println("\n=== PEMANGGILAN HINGGA HABIS ===");
        layanan.panggilMahasiswa();
        layanan.panggilMahasiswa();

        System.out.println("\n=== UJI ANTRIAN KOSONG ===");
        layanan.panggilMahasiswa();

        layanan.tampilkanSisaAntrian();
    }
}
