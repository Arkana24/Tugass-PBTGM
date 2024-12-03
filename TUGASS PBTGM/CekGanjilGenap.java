import java.util.Scanner;

public class CekGanjilGenap {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in); 


        // Meminta pengguna untuk memasukkan angka
        System.out.println("Masukkan angka: ");
        int angka = input.nextInt();

        // Mengecek apakah angka tersebut ganjil atau genap
        if (angka % 2 == 0) {
            System.out.println("Angka yang kamu masukkan adalah genap");
        } else {
            System.out.println("Angka yang kamu masukkan adalah ganjil");
        }
    }
}