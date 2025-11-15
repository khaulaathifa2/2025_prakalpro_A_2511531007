package pekan6_2511531007;

import java.util.Scanner;
import java.util.Random;

public class TugasPekan6_2511531007 {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        final int TARGET = 7; 
        int percobaan = 0;
        boolean out = true;
        String jawab;
        
        System.out.println("##### Permainan Lempar Dadu #####\n");

        while (out) { 
            percobaan++;
            
            int d1 = rand.nextInt(6) + 1;
            int d2 = rand.nextInt(6) + 1;
            int hasil = d1 + d2;
            
            System.out.println(d1 + " + " + d2 + " = " + hasil);
            
            if (hasil == TARGET) {
                System.out.println("Tebakan Anda Benar");
                System.out.println("Anda menang setelah " + percobaan + " percobaan!");
                break;
            } else {
                System.out.println("Tebakan Anda Salah");
                System.out.print("Apakah mau lempar dadu (ya / tidak?) ");
                jawab = input.nextLine();
                
                if (jawab.equalsIgnoreCase("tidak")) {
                	out = false;
                	System.out.println("Anda gagal menang");
                    break; 
                }
            }
        }
        input.close();
    }
}