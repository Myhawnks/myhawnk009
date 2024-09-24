package pertemuan.pkg13_tugas.pkg1;

public class Pertemuan13_Tugas1 {
    static class CalculatorSederhana {
        int tambah(int a, int b) {
            return a + b;
        }
        int tambah(int a, int b, int c) {
            return a + b + c;
        }
        int pengurangan(int a, int b) {
            return a - b;
        }
        int perkalian(int a, int b) {
            return a * b;
        }
        double pembagian(int a, int b) {
            if(b != 0) {
                return(double) a / b;
            } else {
                System.out.println("Pembagian dengan nol tidak diperbolehkan");
                return Double.NaN;
            }
        }
    }
    
    public static void main(String[] args) {
        CalculatorSederhana objek = new CalculatorSederhana();
        
        System.out.println("Hasil Pertambahan : " + objek.tambah(10, 20));
        System.out.println("Hasil Pertambahan (3 angka) : " + objek.tambah(10, 20, 30));
        System.out.println("Hasil  Pengurangan : " + objek.pengurangan(20, 10));
        System.out.println("Hasil Perkalian : " + objek.perkalian(20, 10));
        System.out.println("Hasil Pembagian : " + objek.pembagian(20, 10));
    }
}