
public class PaketInternetDemo {
    public static void main(String[] args) {
        PaketInternet p1 = new PaketInternet("M001", "Andi", 5000);
        PaketInternet p2 = new PaketInternet("M002", "Budi", 1500);
        PaketInternet p3 = new PaketInternet("M003", "Citra", 500);

        System.out.println("=== DATA AWAL ===");
        p1.tampilkanInfo();
        System.out.println();
        p2.tampilkanInfo();
        System.out.println();
        p3.tampilkanInfo();

        System.out.println("\n=== PENGGUNAAN BERHASIL ===");
        System.out.println("Kuota sebelum: " + p1.getKuota() + " MB");
        p1.gunakanKuota(2000);
        System.out.println("Kuota sesudah: " + p1.getKuota() + " MB");

        System.out.println("\n=== PENGGUNAAN MELEBIHI KUOTA ===");
        System.out.println("Kuota sebelum: " + p2.getKuota() + " MB");
        p2.gunakanKuota(2000);
        System.out.println("Kuota sesudah: " + p2.getKuota() + " MB");

        
        System.out.println("\n=== PENGGUNAAN NOL ===");
        System.out.println("Kuota sebelum: " + p1.getKuota() + " MB");
        p1.gunakanKuota(0);
        System.out.println("Kuota sesudah: " + p1.getKuota() + " MB");

        System.out.println("\n=== PENGGUNAAN NEGATIF ===");
        System.out.println("Kuota sebelum: " + p1.getKuota() + " MB");
        p1.gunakanKuota(-100);
        System.out.println("Kuota sesudah: " + p1.getKuota() + " MB");


        System.out.println("\n=== PEMBELIAN KUOTA ===");
        System.out.println("Kuota sebelum: " + p3.getKuota() + " MB");
        p3.beliKuota(1000);
        System.out.println("Kuota sesudah: " + p3.getKuota() + " MB");

        System.out.println("\n=== STATUS HABIS ===");
        PaketInternet p4 = new PaketInternet("M004", "Dina", 500);
        p4.gunakanKuota(500);
        p4.tampilkanInfo();

        System.out.println("\n=== STATUS MENIPIS ===");
        p3.gunakanKuota(1000);
        p3.tampilkanInfo();

        System.out.println("\n=== STATUS CUKUP ===");
        p1.tampilkanInfo();

        System.out.println("\n=== PEMBELIAN KUOTA NEGATIF ===");
        System.out.println("Kuota sebelum: " + p3.getKuota() + " MB");
        p3.beliKuota(-500);
        System.out.println("Kuota sesudah: " + p3.getKuota() + " MB");

    }
}
