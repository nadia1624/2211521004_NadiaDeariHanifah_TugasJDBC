import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Barang barang = null;

        try {
            int menu;
            do {
                System.out.println("Menu:");
                System.out.println("1. Input Barang");
                System.out.println("2. Tampilkan Barang");
                System.out.println("3. Perbarui Barang");
                System.out.println("4. Hapus Barang");
                System.out.println("0. Keluar");
                System.out.print("Pilih menu: ");
                menu = scanner.nextInt();

                switch (menu) {
                    case 1:
                      

                        System.out.println("");
                        System.out.println("Input Data Barang");
                        System.out.println("------------------------");
                        System.out.print("Kode Barang   : ");
                        String kodeBarang = scanner.nextLine();
                        kodeBarang = scanner.nextLine();
                        System.out.print("Nama Barang   : ");
                        String namaBarang = scanner.nextLine();
                        System.out.print("Harga Barang  : ");
                        double hargaBarang = scanner.nextDouble();
                        System.out.print("Jumlah Beli   : ");
                        int jumlahBeli = scanner.nextInt();

                        barang = new Barang(kodeBarang,namaBarang, hargaBarang, jumlahBeli);
                        barang.simpanTransaksi();
                        break;
                    case 2:
                        if (barang != null) {
                            System.out.println("Data Barang:");
                            barang.bacaTransaksiDariDatabase();
                        } else {
                            System.out.println("Belum ada barang yang dimasukkan.");
                        }
                        break;
                    case 3:
                        if (barang != null) {
                            System.out.print("Masukkan Kode Barang yang akan diperbarui: ");
                            String idUpdate = scanner.nextLine();
                            idUpdate=scanner.nextLine();
                            System.out.print("Masukkan Harga Barang Baru: ");
                            double newHarga = scanner.nextDouble();
                            barang.perbaruiTransaksiDiDatabase(idUpdate, newHarga);
                        } else {
                            System.out.println("Belum ada barang yang dimasukkan.");
                        }
                        break;
                    case 4:
                        if (barang != null) {
                            System.out.print("Masukkan Kode Barang yang akan dihapus: ");
                            String idHapus = scanner.nextLine();
                            idHapus = scanner.nextLine();
                            barang.hapusTransaksiDariDatabase(idHapus);
                        } else {
                            System.out.println("Belum ada transaksi yang dimasukkan.");
                        }
                        break;
                    case 0:
                        System.out.println("Keluar dari program.");
                        break;
                    default:
                        System.out.println("Menu tidak valid.");
                        break;
                }
            } while (menu != 0);

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}