import java.util.Scanner;
public class MataKuliahDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nMasukkan jumlah mata kuliah    : ");
        int jumlahMatkul = sc.nextInt();
        sc.nextLine(); 

        MataKuliah12[] arrayOfMatakuliah = new MataKuliah12[jumlahMatkul];

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("\nMasukkan Data Mata Kuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new MataKuliah12();
            arrayOfMatakuliah[i].tambahData(sc);
        }

        System.out.println("\n=== Data Mata Kuliah ===");
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}




