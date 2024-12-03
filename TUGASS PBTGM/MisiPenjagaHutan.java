import java.util.Scanner;

public class MisiPenjagaHutan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahMakanan;

        System.out.println("Selamat datang, Owu'o! Program ini akan membantumu menentukan jumlah makanan hewan.");

        do {
            System.out.print("Masukkan jumlah makanan yang dikumpulkan (angka negatif untuk berhenti): ");
            jumlahMakanan = scanner.nextInt();

            if (jumlahMakanan >= 0) {
                if (jumlahMakanan % 2 == 0) {
                    System.out.println("Jumlah makanan " + jumlahMakanan + " adalah genap. Makanan dapat dibagi rata.");
                } else {
                    System.out.println("Jumlah makanan " + jumlahMakanan + " adalah ganjil. Cari satu makanan lagi agar bisa dibagi rata.");
                }
            }
        } while (jumlahMakanan >= 0);

        System.out.println("Terima kasih telah menggunakan program ini!");
    }
}