import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000, totalTiketTerjual=0;
        Double totalHrgPenjualan=0.0;

        System.out.println("Masukkan jumlah pelanggan hari ini: " );
        int jmlPelanggan = sc.nextInt();
        
        for(int i=1; i<=jmlPelanggan; i++){
            System.out.println("Masukkan nama pelanggan ke-"+ i + ": ");
            String namaPelanggan = sc.next();
            System.out.println("Masukkan jumlah tiket yang dibeli " + namaPelanggan + ": ");
            int jmlTiket = sc.nextInt();

            int totalHarga = jmlTiket * hargaTiket;
            System.out.println("Total yang harus dibayar " + namaPelanggan + " : Rp " + totalHarga);

            totalTiketTerjual += jmlTiket;
            totalHrgPenjualan += totalHarga;

            System.out.println("Total tiket terjual sampai pelanggan ke-" + i + " : " + totalTiketTerjual);
            System.out.println("Total harga penjualan sampai pelanggan ke-" + i + " : Rp " + totalHrgPenjualan);
            System.out.println("--------------------------------------------------"); 
        }
        sc.close();
    }
    
}