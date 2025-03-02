public class Dosen12 {
    public String kode;
    public String nama;
    public boolean jenisKelamin;
    public int usia;

    public Dosen12(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void cetakInfo() {
        System.out.println("Kode Dosen   : " + this.kode);
        System.out.println("Nama Dosen   : " + this.nama);
        System.out.println("Jenis Kelamin: " + (this.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia         : " + this.usia + " tahun");
        System.out.println("-------------------------------");
    }
}