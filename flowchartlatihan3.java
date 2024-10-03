import java.util.Scanner;
public class flowchartlatihan3 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        String merk, kategori;
        int ukuran, harga = 0;

        System.out.print("Masukkan merk sepatu (Converse/Sketcher/Nike)");
        merk = input03.nextLine();

        System.out.print("Masukkan kategori sepatu (Slip on/high top/woman/man/kids/Adult)");
        kategori = input03.nextLine();

        System.out.print("Masukkan ukuran sepatu: ");
        ukuran = input03.nextInt();

        if (merk.equalsIgnoreCase("Converse")) {
            if (kategori.equalsIgnoreCase("Slip on") && ukuran >=36 && ukuran <=40) {
                harga = 800000;
            } else if (kategori.equalsIgnoreCase("High Top") && ukuran >= 40 && ukuran <=44) {
                harga = 1200000;
            } else {
                System.out.println("Kategori atau ukuran tidak valid untuk Converse");

            }
                
            }else if (merk.equalsIgnoreCase("Sketcher")) {
                if (kategori.equalsIgnoreCase("Woman") && ukuran >= 41 && ukuran <= 41) {
                    harga = 1000000;
                }else if (kategori.equalsIgnoreCase("Man") && ukuran >= 41 && ukuran <= 44) {
                    harga = 1800000;
                    
                }else  {
                    System.out.println("Kategori atau ukuran tidak valid untuk Sketcher.");

                }

            } else if (merk.equalsIgnoreCase("Nike")) {
                if (kategori.equalsIgnoreCase("kids") && ukuran >= 36 && ukuran <=40) {
                    harga = 750000;
                } else if (kategori.equalsIgnoreCase("Adult")) {
                    harga = 1500000;
                }else {
                    System.out.println("Kategori atau ukuran tidak valid untuk Nike");

                }
            } else {
                System.out.println("Merk sepatu tidak valid");
            }
            if (harga > 0) {
                System.out.println("Harga sepatu adalah: Rp " + harga);
            }
                
            }
                    
                }
                
         
