public class Student2 { // Ini adalah deklarasi kelas 
    private String nama;
    private int kredit;
    private double IPK;
    private double poinKualitas;

    //constructor
    public Student2(String nama, int kredit, double IPK, double poinKualitas) {
        this.nama = nama;
        this.kredit = kredit;
        this.IPK = IPK;
        this.poinKualitas = poinKualitas;
    } // end constructor

    // metode menghitung rata-rata Metode ini mengembalikan 
    //nilai rata-rata poin, yang dihitung dengan cara membagi poin kualitas dengan jumlah kredit.
    public double rataRataPoin() {
        return poinKualitas / kredit;
    }

    // metode menambahkan kredit dan poin kualitas
    public void tambahKredit(int kreditBaru, double poinKualitasBaru) {
        kredit += kreditBaru;
        poinKualitas += poinKualitasBaru;
        IPK = poinKualitas / kredit;
        
        // Menentukan poin kualitas berdasarkan nilai IPK
        if (IPK > 3.5) {
            poinKualitas = 'A';
        } else if (IPK > 2.75) {
            poinKualitas = 'B';
        } else if (IPK > 2.5){
            poinKualitas = 'C';
        }else if (IPK > 2){
            poinKualitas = 'D';
        }else{
            poinKualitas = 'E';
        }
           
    }
    // metode nama
    public String getNama() {
        return nama;
    }

    // metode kredit
    public int getKredit() {
        return kredit;
    }

    // metode IPK
    public double getIPK() {
        return IPK;
    }

    // metode Poin Kualitas
    public char getPoinKualitas() {
        return (char) poinKualitas;
    }
}
