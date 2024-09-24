package pertemuan.pkg8_tugas.pkg1;
import java.util.Scanner;

public class Pertemuan8_Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nilai Awal ? : ");
        int nilaiAwal = scanner.nextInt();
        
        System.out.print("Nilai Akhir ? : ");
        int nilaiAkhir = scanner.nextInt();
        
        if(nilaiAwal > nilaiAkhir) {
        System.out.println("Nilai akhir harus lebih besar atau sama dengan nilai awal");
        } else {
            int nomor = 1;
            for(int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
                System.out.println(nomor + ". " + i);
                nomor++;
            }
        }
        scanner.close();
    }
}
