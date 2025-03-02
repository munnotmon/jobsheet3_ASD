public class DataDosen12 {
    public static void dataSemuaDosen(Dosen12[] arrayOfDosen) {
        for (Dosen12 dosen : arrayOfDosen) {
            dosen.cetakInfo();
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen12[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen12 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("\nJumlah Dosen Pria  : " + pria);
        System.out.println("Jumlah Dosen Wanita: " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen12[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0, countPria = 0, countWanita = 0;
        for (Dosen12 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalPria += dosen.usia;
                countPria++;
            } else {
                totalWanita += dosen.usia;
                countWanita++;
            }
        }
        System.out.println("\nRata-rata usia Dosen Pria  : " + (countPria == 0 ? 0 : (double) totalPria / countPria));
        System.out.println("Rata-rata usia Dosen Wanita: " + (countWanita == 0 ? 0 : (double) totalWanita / countWanita));
    }

    public static void infoDosenPalingTua(Dosen12[] arrayOfDosen) {
        Dosen12 tertua = arrayOfDosen[0];
        for (Dosen12 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }
        System.out.println("\nDosen Paling Tua:");
        tertua.cetakInfo();
    }

    public static void infoDosenPalingMuda(Dosen12[] arrayOfDosen) {
        Dosen12 termuda = arrayOfDosen[0];
        for (Dosen12 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }
        System.out.println("\nDosen Paling Muda:");
        termuda.cetakInfo();
    }
}