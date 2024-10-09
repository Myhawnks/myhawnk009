package pertemuan.pkg9_tugas.pkg2;
import java.util.Scanner;

public class Pertemuan9_Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input nilai awal dan akhir
        System.out.print("Masukkan nilai awal: ");
        int nilaiAwal = scanner.nextInt();
        
        System.out.print("Masukkan nilai akhir: ");
        int nilaiAkhir = scanner.nextInt();
        
        // Menampilkan deret bilangan bulat dengan pertambahan 5
        System.out.println("Deret bilangan bulat dengan pertambahan 5:");
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.print(i + " ");
        }
        // Menutup scanner
        scanner.close();
    }
}
