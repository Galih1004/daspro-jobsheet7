import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenisKendaraan;
        int durasi;
        int totalBayar;
        
        while (true) {
            System.out.println("\n=== Sistem Pembayaran Parkir ===");
            System.out.print("Masukkan jenis kendaraan (1 = Mobil, 2 = Motor, 0 = Keluar): ");
            jenisKendaraan = sc.nextInt();

            if (jenisKendaraan == 0) {
                System.out.println("Program selesai. Terima kasih!");
                break;
            }

            if (jenisKendaraan != 1 && jenisKendaraan != 2) {
                System.out.println("Jenis kendaraan tidak valid. Silakan masukkan ulang.");
                continue;
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();

            if (durasi > 5) {
                totalBayar = 12500;
            } else {
                if (jenisKendaraan == 1) {
                    totalBayar = durasi * 3000;
                } else {
                    totalBayar = durasi * 2000;
                }
            }

            System.out.println("Total yang harus dibayar: Rp " + totalBayar);
        }
        sc.close();
    }
}
