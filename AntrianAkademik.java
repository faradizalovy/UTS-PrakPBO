import java.util.ArrayList;
public class AntrianAkademik {
    private ArrayList<Integer> nomorAntrian;
    private ArrayList<String> namaMahasiswa;
    private int nomorBerikutnya;

    public AntrianAkademik() {
        nomorAntrian = new ArrayList<>();
        namaMahasiswa = new ArrayList<>();
        nomorBerikutnya = 1;
    }
    public void tambahMahasiswa(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("Nama mahasiswa tidak boleh kosong.");
            return;
        }
        nomorAntrian.add(nomorBerikutnya);
        namaMahasiswa.add(nama);

        System.out.println("Nomor Antrian: " + nomorBerikutnya + " | Nama: " + nama);
        nomorBerikutnya++;
    }
    public void panggilMahasiswa() {
        if (nomorAntrian.isEmpty()) {
            System.out.println("Tidak ada antrian untuk dipanggil.");
            return;
        }
        System.out.println("Mahasiswa dipanggil: Nomor Antrian " + nomorAntrian.get(0) 
        + " | Nama: " + namaMahasiswa.get(0));
        nomorAntrian.remove(0);
        namaMahasiswa.remove(0);
    }
    public void tampilkanSisaAntrian() {
        System.out.println("\n--- Sisa Antrian ---");

        if (nomorAntrian.isEmpty()) {
            System.out.println("Tidak ada mahasiswa yang menunggu.");
            return;
        }
        for (int i = 0; i < nomorAntrian.size(); i++) {
            System.out.println("Nomor Antrian: " + nomorAntrian.get(i) + " | Nama: " + namaMahasiswa.get(i));
        }
        System.out.println("Jumlah mahasiswa menunggu: " + nomorAntrian.size());
    }
}
