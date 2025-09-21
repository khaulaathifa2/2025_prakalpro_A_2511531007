package pekan2;

import java.util.Scanner;

public class TugasAlproPekan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variabel
        float berat, tinggi, bmi;
        int usia;
        char jenisKelamin;     // 'L' atau 'P'
        boolean perluOlahraga;
        int frekuensiOlahraga; // kali per minggu

        // Input dari pengguna
        System.out.println("=== SARAN OLAHRAGA BERDASARKAN BERAT BADAN ===");
        System.out.print("Masukkan berat badan Anda (kg): ");
        berat = input.nextFloat();

        System.out.print("Masukkan tinggi badan Anda (cm): ");
        tinggi = input.nextFloat();

        System.out.print("Masukkan usia Anda: ");
        usia = input.nextInt();

        System.out.print("Jenis kelamin (L/P): ");
        jenisKelamin = input.next().charAt(0);

        // Hitung BMI (tinggi diubah ke meter)
        tinggi = tinggi / 100; // ubah cm ke meter
        bmi = berat / (tinggi * tinggi);

        // Tentukan apakah perlu olahraga & frekuensinya
        if (bmi < 18.5) {
            perluOlahraga = true;
            frekuensiOlahraga = 3; // untuk kurus: bangun massa otot
        } else if (bmi <= 24.9) {
            perluOlahraga = usia > 30; // ideal, tapi jika di atas 30 tetap disarankan
            frekuensiOlahraga = 2;
        } else if (bmi <= 29.9) {
            perluOlahraga = true;
            frekuensiOlahraga = 4; // overweight
        } else {
            perluOlahraga = true;
            frekuensiOlahraga = 5; // obesitas
        }

        // Tambah rekomendasi jika usia > 50
        if (usia > 50) {
            frekuensiOlahraga = Math.min(frekuensiOlahraga, 3); // maksimal 3x untuk lansia
        }

        // Output hasil
        System.out.println("\n=== HASIL ANALISIS ===");
        System.out.printf("BMI Anda: %.1f\n", bmi);
        System.out.println("Kategori: " + 
            (bmi < 18.5 ? "Kurus" : 
             bmi <= 24.9 ? "Normal" : 
             bmi <= 29.9 ? "Overweight" : "Obesitas"));

        if (perluOlahraga) {
            System.out.println("💡 Anda disarankan olahraga " + frekuensiOlahraga + " kali per minggu.");
            if (bmi < 18.5) System.out.println("   → Fokus pada olahraga pembentukan otot.");
            else if (bmi > 25) System.out.println("   → Fokus pada kardio dan pembakaran lemak.");
            if (usia > 50) System.out.println("   → Sesuaikan intensitas, jangan berlebihan.");
        } else {
            System.out.println("✅ Berat badan Anda ideal. Olahraga ringan 1-2x seminggu cukup untuk menjaga kesehatan.");
        }

        input.close();
    }
}