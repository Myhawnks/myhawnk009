package pertemuan.pkg7_tugas.pkg2;
import java.util.Scanner;

public class Pertemuan7_Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("NIM : ");
        String nim = scanner.nextLine();
        
        System.out.print("Nama : ");
        String nama = scanner.nextLine();
        
        System.out.print("Tahun : ");
        int tahun = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Pilih Peminatan (M/T/P) : ");
        char peminatan = scanner.nextLine().toUpperCase().charAt(0);
        
        
        switch(tahun) {
            case 3:
                switch(peminatan) {
                    case 'M':
                    System.out.println("Mahasiswa " + nama + " dengan NIM " + nim + "memilih peminatan menejemen.");
                    break;
                    case 'T':
                    System.out.println("Mahasiswa " + nama + " dengan NIM " + nim + "memilih peminatan tehnik.");
                    break;
                    case 'P':
                    System.out.println("Mahasiswa " + nama + " dengan NIM " + nim + "memilih peminatan pendidikan.");
                    break;
                    default:
                    System.out.println("Peminatan tidak valid");
                    break;
                }
                break;
                default:
                System.out.println("PEMOGRAMAN MOBILE, PEMOGRAMAN JAVA 2");
                break;
        }
        scanner.close();
    }
}
