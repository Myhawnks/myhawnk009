 package pertemuan.pkg6_tugas.pkg2;
import java.util.Scanner;

public class Pertemuan6_Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("NIM ? : ");
        int NIM = input.nextInt();
        
        input.nextLine(); // Menambahkan ini untuk mengonsumsi newline
        
        System.out.print("Nama ? : ");
        String Nama = input.nextLine();
        
        System.out.print("Nilai ? : ");
        int Nilai = input.nextInt();
        
        char grade;
        if (Nilai >= 85) {
            grade = 'A';
        } else if (Nilai >= 70) {
            grade = 'B';
        } else if (Nilai >= 55) {
            grade = 'C';
        } else if (Nilai >= 40) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        
        System.out.println("/Output:");
        System.out.println("NIM : " + NIM);
        System.out.println("Nama : " + Nama);
        System.out.println("Nilai : " + Nilai);
        System.out.println("Grade : " + grade);
        System.out.println("Keterangan : Selamat anda lulus");
        
        input.close();
    }
}
