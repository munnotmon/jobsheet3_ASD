import java.util.Scanner;

public class DosenDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nMasukkan jumlah dosen: ");
        int jumlahDosen = sc.nextInt();
        sc.nextLine();  

        Dosen12[] daftarDosen = new Dosen12[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode Dosen         : ");
            String kode = sc.nextLine();
            System.out.print("Nama Dosen         : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (P = Pria, W = Wanita): ");
            char jk = sc.next().charAt(0);
            boolean jenisKelamin = (jk == 'P' || jk == 'p');
            System.out.print("Usia               : ");
            int usia = sc.nextInt();
            sc.nextLine(); 

            daftarDosen[i] = new Dosen12(kode, nama, jenisKelamin, usia);
            System.out.println("-------------------------------");
        }

        System.out.println("\nData Dosen yang telah dimasukkan:");
        DataDosen12.dataSemuaDosen(daftarDosen);
        DataDosen12.jumlahDosenPerJenisKelamin(daftarDosen);
        DataDosen12.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        DataDosen12.infoDosenPalingTua(daftarDosen);
        DataDosen12.infoDosenPalingMuda(daftarDosen);
    }
}