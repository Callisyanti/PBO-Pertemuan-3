public class testerBangunRuang{
    public static void main(String[] args) {
        BangunRuang Balok = new BangunRuang();

        Balok.setpanjang(5);
        Balok.setlebar(5);
        Balok.settinggi(5);
        
        int p = Balok.getpanjang();
        int l = Balok.getlebar();
        int t = Balok.gettinggi();

        System.out.println("Panjang Balok : " + p);
        System.out.println("Lebar Balok : " + l);
        System.out.println("Tinggi Balok : " + t);
        System.out.println("Jadi Volume Balok Adalah : " + p * l * t);
    }
}