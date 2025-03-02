import java.util.Scanner;
public class MahasiswaDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa12[] arrayOfMahasiswa12 = new Mahasiswa12[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa12[i] = new Mahasiswa12();

            System.out.println("\nMasukkan Data Mahasiswa ke-"+ (i + 1));
            System.out.print("NIM       : ");
            arrayOfMahasiswa12[i].nim = sc.nextLine();
            System.out.print("NAMA      : ");
            arrayOfMahasiswa12[i].nama = sc.nextLine();
            System.out.print("KELAS     : ");
            arrayOfMahasiswa12[i].kelas = sc.nextLine();
            System.out.print("IPK       : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa12[i].ipk = Float.parseFloat(dummy);
            System.out.println("----------------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("\nData Mahasiswa ke-"+ (i + 1));
            System.out.println("NIM       : " + arrayOfMahasiswa12[i].nim);
            System.out.println("NAMA      : " + arrayOfMahasiswa12[i].nama);
            System.out.println("KELAS     : " + arrayOfMahasiswa12[i].kelas);
            System.out.println("IPK       : " + arrayOfMahasiswa12[i].ipk);
            System.out.println("----------------------------------------");
        }
    }
}
