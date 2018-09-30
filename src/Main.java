import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Double harga;
        String kode;
        Scanner s = new Scanner(System.in);
        System.out.print("Amount: ");
        harga = s.nextDouble();
        s.nextLine();
        System.out.print("Kode Promo: ");
        kode = s.nextLine();
        Hitung h =new Hitung(harga, kode);
        System.out.println();
        System.out.println("Diskon: "+h.diskon+"%");
        System.out.println("Amount yang harus dibayar: "+h.bayar());
    }
}
