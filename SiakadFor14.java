import java.util.Scanner;

public class SiakadFor14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nilai, Tertinggi = 0, Terendah = 100;
        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = scanner.nextDouble();

            if (nilai > Tertinggi) {
                Tertinggi = nilai;
            }
            if (nilai < Terendah) {
                Terendah = nilai;
            }
            if (nilai > 60) {
               lulus++;
            } else {
               tidakLulus++;
            }
        }
            System.out.println("Nilai tertinggi :" + Tertinggi);
            System.out.println("Nilai terendah :" + Terendah);
            System.out.println("Jumlah lulus :" + lulus);
            System.out.println("Jumlah tidak lulus :" + tidakLulus);

        scanner.close();
    }
}