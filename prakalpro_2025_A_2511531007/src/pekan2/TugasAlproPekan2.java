package pekan2;

import java.util.Scanner;

public class TugasAlproPekan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Meminta input dari pengguna
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine(); // NIM disimpan sebagai String

        System.out.print("Masukkan Nama Lengkap: ");
        String nama = scanner.nextLine(); // Nama disimpan sebagai String

        System.out.print("Masukkan Umur: ");
        int umur = scanner.nextInt(); // Umur disimpan sebagai int

        // 2. Konversi umur menjadi String
        String umurString = String.valueOf(umur);

        // 3. Konversi NIM menjadi Long, lalu tambahkan dengan umur
        long nimLong = Long.parseLong(nim);
        long hasilPenjumlahan = nimLong + umur;

        // 4. Cetak hasil sesuai format yang diminta
        System.out.println("\n=== Data Mahasiswa===");
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur + " tahun");
        // Catatan: Instruksi meminta baris "IPK :<IPK>", tapi contoh output TIDAK mencetaknya.
        // Berdasarkan contoh output, baris IPK di-SKIP.
        System.out.println("Umur(String): " + umurString);
        System.out.println("NIM+ Umur : " + hasilPenjumlahan);

        scanner.close();
    }
}