package pertemuan.pkg8_tugas.pkg2;
import java.util.Scanner;

public class Pertemuan8_Tugas2 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Tahun Akhir ?: ");
        int tahunAkhir = scanner.nextInt();
        
        System.out.print("Tahun Awal ?: ");
        int tahunAwal = scanner.nextInt();
        
        if(tahunAwal > tahunAkhir) {
            System.out.println("Tahun awal harus lebih kecil atau sama dengan tahun akhir.");
        } else {
            for(int i = tahunAkhir; i >= tahunAwal; i--) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
