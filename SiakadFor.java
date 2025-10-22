import java.util.Scanner;

public class SiakadFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nilai, Tertinggi = 0, Terendah = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = scanner.nextDouble();

            if (nilai > Tertinggi) {
                Tertinggi = nilai;
            }
            if (nilai < Terendah) {
                Terendah = nilai;
            }
        }
            System.out.println("Nilai tertinggi :" + Tertinggi);
            System.out.println("Nilai terendah :" + Terendah);

        scanner.close();
    }
}