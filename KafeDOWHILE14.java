import java.util.Scanner;

public class KafeDOWHILE14 {
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in); 
       int kopi, teh, roti;
       String namaPelanggan;
       int hargaKopi=12000,hargaTeh=7000,hargaRoti=20000;

       do {
            System.out.print("Masukkan nama pelanggan (Ketik 'Batal' Untuk Membatalkan): ");
            namaPelanggan=sc.nextLine();
            if(namaPelanggan.equalsIgnoreCase("Batal")){
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Masukkan jumlah kopi yang dipesan: ");
            kopi=sc.nextInt();
            System.out.print("Masukkan jumlah teh yang dipesan: ");
            teh=sc.nextInt();
            System.out.print("Masukkan jumlah roti yang dipesan: ");
            roti=sc.nextInt();
            int totalHarga=(kopi*hargaKopi)+(teh*hargaTeh)+(roti*hargaRoti);
            System.out.println("Total harga untuk " + namaPelanggan + " adalah: Rp " + totalHarga);
       } while (true);
         sc.close();
    }
}
