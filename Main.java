import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dealer dealer = new Dealer();

        try {
            while (true) {
                System.out.println("=== Menu Dealer Mobil ===");
                System.out.println("1. Tambah Mobil Baru");
                System.out.println("2. Tambah Mobil Bekas");
                System.out.println("3. Tampilkan Semua Mobil");
                System.out.println("0. Keluar");
                System.out.print("Pilih menu: ");
                int pilihan = input.nextInt();

                if (pilihan == 0) break;

                input.nextLine(); // clear buffer
                System.out.print("Masukkan Merk: ");
                String merk = input.nextLine();
                System.out.print("Masukkan Model: ");
                String model = input.nextLine();
                System.out.print("Masukkan Harga: ");
                double harga = input.nextDouble();

                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan Garansi (tahun): ");
                        int garansi = input.nextInt();
                        dealer.tambahMobil(new MobilBaru(merk, model, harga, garansi));
                        break;
                    case 2:
                        System.out.print("Masukkan Tahun Produksi: ");
                        int tahun = input.nextInt();
                        dealer.tambahMobil(new MobilBekas(merk, model, harga, tahun));
                        break;
                    case 3:
                        dealer.tampilSemuaMobil();
                        break;
                    default:
                        System.out.println("Menu tidak valid.");
                }
            }
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input: " + e.getMessage());
        }

        input.close();
    }
}
