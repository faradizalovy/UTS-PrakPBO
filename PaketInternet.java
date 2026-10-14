
public class PaketInternet {
    private String idPelanggan;
    private String nama;
    private int kuota;

    public PaketInternet(String idPelanggan, String nama, int kuotaAwal) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.kuota = kuotaAwal;
    }
    public String getIdPelanggan() {
        return idPelanggan;
    }
    public String getNama() {
        return nama;
    }
    public int getKuota() {
        return kuota;
    }
    public String getStatusKuota() {
        if (kuota == 0) {
            return "HABIS";
        } else if (kuota <= 1000) {
            return "MENIPIS";
        } else {
            return "CUKUP";
        }
    }

    public void gunakanKuota(int jumlah) {
        if (jumlah <= 0) {
            System.out.println(
                    "Ditolak: penggunaan harus lebih dari 0 MB.");
        } else if (jumlah > kuota) {
            System.out.println(
                    "Ditolak: kuota tidak mencukupi.");
        } else {
            kuota = kuota - jumlah;
            System.out.println("Penggunaan kuota berhasil.");
        }
    }
    public void beliKuota(int jumlah) {
        if (jumlah <= 0) {
            System.out.println(
                    "Ditolak: pembelian harus lebih dari 0 MB.");
        } else {
            kuota = kuota + jumlah;
            System.out.println("Pembelian kuota berhasil.");
        }
    }
    public void tampilkanInfo() {
        System.out.println("ID Pelanggan: " + idPelanggan);
        System.out.println("Nama: " + nama);
        System.out.println("Sisa Kuota: " + kuota + " MB");
        System.out.println("Status Kuota: " + getStatusKuota());
    }
}
