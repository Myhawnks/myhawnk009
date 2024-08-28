package pertemuan.pkg6_tugas.pkg1;
import java.util.Scanner;

public class Pertemuan6_Tugas1 {
    public static void main(String[] args) {
    Scanner masuk = new Scanner(System.in);
    System.out.println("Masukan NIM : ");
    System.out.println("Masukan Nama : ");
    System.out.println("Masukan nilai : ");
    int nilai = masuk.nextInt();
    String predikat = nilai > 100 ? "OMG YOU ALBERT AINSTEIN":
                      nilai >= 90 ? "Grade A":
                      nilai >= 75 ? "Grade B":
                                    "Kurang";
    System.out.println(predikat);
    }
}