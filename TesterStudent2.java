public class TesterStudent2 {
    public static void main(String[] args) {
        // Membuat objek Student2
        Student2 student1 = new Student2("Callisyanti", 40, 3.5, 105.0);

        // Menampilkan informasi sebelum  menambah kredit
        System.out.println("Sebelum menambah kredit:");
        System.out.println("Nama: " + student1.getNama());
        System.out.println("Kredit: " + student1.getKredit());
        System.out.println("IPK: " + student1.getIPK());
        System.out.println("Poin Kualitas: " + student1.getPoinKualitas());

        // Menghitung rata-rata poin
        double rataRata = student1.rataRataPoin();
        System.out.println("Rata-rata Poin: " + rataRata);

        // Menambahkan kredit
        student1.tambahKredit(10, 45.0);

        // Menampilkan informasi setelah penambahan kredit
        System.out.println("\nSetelah menambah kredit:");
        System.out.println("Kredit: " + student1.getKredit());
        System.out.println("IPK: " + student1.getIPK());
        System.out.println("Poin Kualitas: " + student1.getPoinKualitas());
    }
}
