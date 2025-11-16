package pekan7_2511531007;

import java.util.Scanner;

public class tugasAlproPekan7_2511531007 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("=====REGISTRASI AKUN BARU=====");
		
		System.out.print("Masukkan Username: ");
		String username = input.nextLine();
		
		System.out.print("Masukkan Password: ");
		String password = input.nextLine();
		
		System.out.print("Masukkan Email: ");
		String email = input.nextLine();
		
		System.out.print("Masukkan PIN (6 digit): ");
		int pin = input.nextInt();
		
		Akun_2511531007 regis = new Akun_2511531007();
		regis.setUsername(username);
		regis.setPassword(password);
		regis.setEmail(email);
		regis.setPinAngka(pin);
		
		if(!regis.isPasswordValid()) {
			System.out.println("\n---REGISTRASI GAGAL---");
			System.out.println("Password minimal 8 karakter!");
			System.out.println("Silahkan coba lagi.");
		} else if(!regis.isEmailValid()) {
			System.out.println("\n---REGISTRASI GAGAL---");
			System.out.println("Email anda \"" + email + "\" tidak valid (harus mengandung '@' dan '.')!");
			System.out.println("Silahkan coba lagi.");
		} else {
			System.out.println("\n---REGISTRASI BERHASIL---");
			System.out.println("Akun untuk \"" + username + "\" telah berhasil dibuat.");
			System.out.println("\n---Detail Akun---");
			System.out.println("Username: "+ username.toLowerCase());
			System.out.println("Email: "+ email.toUpperCase());
			System.out.println("ID Pengguna: "+ username + pin);
			System.out.println("\n---Uji Tipe Data---");
			System.out.println(pin + 10);
			System.out.println(pin + "10");			
		}
		input.close();
	}

}
