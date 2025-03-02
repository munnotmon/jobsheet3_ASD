import java.util.Scanner;

public class MataKuliah12 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah12() {
        this.kode = "";
        this.nama = "";
        this.sks = 0;
        this.jumlahJam = 0;
    }

    public MataKuliah12(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(Scanner sc) {
        System.out.print("Kode Mata Kuliah          : ");
        this.kode = sc.nextLine();
        System.out.print("Nama Mata Kuliah          : ");
        this.nama = sc.nextLine();
        System.out.print("SKS Mata Kuliah           : ");
        this.sks = sc.nextInt();
        System.out.print("Jumlah Jam Mata Kuliah    : ");
        this.jumlahJam = sc.nextInt();
        sc.nextLine();
    }

        public void cetakInfo() {
            System.out.println("\nKode Mata Kuliah    : " + this.kode);
            System.out.println("Nama Mata Kuliah      : " + this.nama);
            System.out.println("SKS                   : " + this.sks);
            System.out.println("Jumlah Jam            : " + this.jumlahJam);
            System.out.println("----------------------------------------");
        
    }
}