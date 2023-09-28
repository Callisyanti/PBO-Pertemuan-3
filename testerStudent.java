public class testerStudent{
    public static void main(String[] args) {
        Student student1 = new Student("Callisyanti", 30, 3.5, 105.0);
        System.out.println("Nama: " + student1.getNama());
        System.out.println("Kredit: " + student1.getKredit());
        System.out.println("IPK: " + student1.getIPK());
        System.out.println("Poin Kualitas: " + student1.getPoinKualitas());

        double rataRata = student1.rataRataPoin();
        System.out.println("Rata-rata Poin: " + rataRata);

        student1.tambahKredit(10, 45.0);
        System.out.println("Setelah menambah kredit:");
        System.out.println("Kredit: " + student1.getKredit());
        System.out.println("IPK: " + student1.getIPK());
        System.out.println("Poin Kualitas: " + student1.getPoinKualitas());
    }
}
