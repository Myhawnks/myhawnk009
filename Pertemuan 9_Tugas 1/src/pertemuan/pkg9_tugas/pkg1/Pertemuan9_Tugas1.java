package pertemuan.pkg9_tugas.pkg1;

public class Pertemuan9_Tugas1 {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 5) {
            int j = 1;
            while(j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
