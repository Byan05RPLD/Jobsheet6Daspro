import java.util.Scanner;
public class Pemilihan2Percobaan103 {

    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        int tahun;
        System.out.print("Masukkan tahun");
        tahun = input03.nextInt();

        if ((tahun % 4 ) == 0) {
            if((tahun % 100) !=0)
            System.out.println("Tahun Kabisat");
        } else
        System.out.println("Bukan Tahun Kabisat");
    }
}