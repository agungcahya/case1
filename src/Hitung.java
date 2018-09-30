public class Hitung {
    double harga;
    int diskon;
    Promo p;
    Hitung(double harga, String kode){
        this.harga=harga;
        switch (kode){
            case "New Year":
                this.p = new NewYear();
                this.diskon = ((NewYear) p).diskon();
                break;
            case "Lebaran":
                this.p = new Lebaran();
                this.diskon = ((Lebaran) p).diskon();
                break;
            case "Harbolnas":
                this.p = new Harbolnas();
                this.diskon = ((Harbolnas) p).diskon();
                break;
            default:
                this.diskon = 0;
        }
    }

    public double bayar(){
        double total;
        total = harga-(harga*diskon/100);
        return total;
    }
}
