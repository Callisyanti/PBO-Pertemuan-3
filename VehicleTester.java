 public class VehicleTester{
 public static void main(String[] args) {
        Vehicle Innova = new Vehicle();

        Innova.setMake("Toyota");
        Innova.setMilesPerGallon(30);

        String make = Innova.getMake();
        int mpg = Innova.getMilesPerGallon();

        System.out.println("Merk Mobil : " + make);
        System.out.println("Jumlah Mobil : " + mpg);
    }
 }