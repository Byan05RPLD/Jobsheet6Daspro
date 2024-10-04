import java.util.Scanner;
 
public class flowchartlatihan2 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);

        String jenisBuku, hari;
        int jumlahBuku;
        double hargaPerBuku, totalHarga, totalDiskon = 0, totalBayar;

        System.out.print("Masukkan Hari Saat ini: ");
        hari = input03.nextLine();
        if (!hari.equalsIgnoreCase("Rabu")) {
            System.out.println("Tidak Ada Diskon");
            input03.close();
            return;
        }

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya)");
        jenisBuku = input03.nextLine();
        System.out.print("Masukkan jumlah buku");
        jumlahBuku = input03.nextInt();
        System.out.print("Masukkan harga per buku");
        hargaPerBuku = input03.nextDouble();

        totalHarga = jumlahBuku * hargaPerBuku;

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            totalDiskon = totalHarga * 0.10;
            if (jumlahBuku >=2) {
                totalDiskon += totalHarga * 0.02;
                
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            totalDiskon = totalHarga * 0.07;
            if (jumlahBuku >= 3) {
                totalDiskon += totalHarga * 0.02;
                
            } else {
                if (jumlahBuku >= 3) {
                    totalDiskon = totalHarga * 0.05;
                }
            }

            totalBayar = totalHarga - totalDiskon;

            System.out.println("Total harga awal: " + totalHarga);
            System.out.println("Total diskon: " + totalDiskon);
            System.out.println("Total bayar setelah diskon: " + totalBayar);

            input03.close();

                
        }
    }
}