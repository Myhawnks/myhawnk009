package pertemuan.pkg5_tugas.pkg1;
import java.util.Scanner;

public class Pertemuan5_Tugas1 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        
        System.out.println("Masukan nama anda:");
        String name = myInput.nextLine();
        
        System.out.println("Masukan Usia anda");
        int age = myInput.nextInt();
        
        System.out.println("Masukan Gaji Anda:");
        int salary = myInput.nextInt();
        
        System.out.println("Nama : " + name);
        System.out.println("Usia : " + age);
        System.out.println("Gaji : " + salary);
    }
}
