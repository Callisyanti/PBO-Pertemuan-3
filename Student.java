public class Student{
    private String nama;
    private int kredit;
    private double IPK;
    private double poinKualitas;

    public Student(String nama, int kredit, double IPK, double poinKualitas) {
        this.nama = nama;
        this.kredit = kredit;
        this.IPK = IPK;
        this.poinKualitas = poinKualitas;
    }

    public double rataRataPoin() {
        return poinKualitas / kredit;
    }

    public void tambahKredit(int kreditBaru, double poinKualitasBaru) {
        kredit += kreditBaru;
        poinKualitas += poinKualitasBaru;
        IPK = poinKualitas / kredit;
    }

    public String getNama() {
        return nama;
    }

    public int getKredit() {
        return kredit;
    }

    public double getIPK() {
        return IPK;
    }

    public double getPoinKualitas() {
        return poinKualitas;
    }
}
