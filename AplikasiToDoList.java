import java.util.Scanner;

public class AplikasiToDoList {

    public static String[] model = new String[10];
    public static int count = 0; // Menambahkan variabel untuk menghitung jumlah tugas

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        testViewRemoveTodoList();
    }

    // Menampilkan To Do List
    public static void ShowToDoList() {
        for (int i = 0; i < model.length; i++) {
            String ToDo = model[i];
            int no = i + 1;

            if (ToDo != null) {
                System.out.println(no + ". " + ToDo);
            }
        }
    }

    public static void TestShowToDoList() {
          System.out.println("ToDoList");
        model[0] = "Tugas Jarkomdat";
        model[1] = "Tugas Bahasa Inggris";
        model[2] = "Tugas Pemweb II";
        ShowToDoList();
        ;

    }

    // Menambah To Do List
    public static void AddToDoList(String string) {
        model[count] = string;
        count++;
    }

    // Menghapus To Do List
    public static boolean RemoveToDoList(Integer number) {
        if (number < 1 || number > count) {
            return false;
        }
        for (int i = number - 1; i < count - 1; i++) {
            model[i] = model[i + 1];
        }
        model[count - 1] = null;
        count--;
        return true;
    } 

    // Menampilkan View To Do List
    public static void ViewShowToDoList() {
       while (true){
        ShowToDoList();
        System.out.println("MENU");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("x. Keluar");

        System.out.println("Pilih: ");
        String input = scanner.nextLine();

       if (input.equals("1")) {
        ViewAddToDoList();
       } else if (input.equals("2")){
        ViewRemoveToDoList();
       } else if (input.equals("x")){
        break;
       } else {
        System.out.println("Pilihan tidak dimengerti");
       }
       }
       scanner.close();
    }


    public static void testViewShowToDoList(){
       System.out.println("ToDoList");
        model[0] = "Satu";
        model[1] = "Dua";
        model[2] = "Tiga";
        model[3] = "Empat";
       

        ViewShowToDoList();
    }

    // MenampilkN View menambah To Do List
    public static void ViewAddToDoList() {
        System.out.println("MENAMBAH TODOLIST");
        System.out.print("Todo (x Jika Batal): ");
        
        String todo = input();

        if(todo.equals("x")){
            // Batal
        }else{
            AddToDoList(todo);
        }
    }

    private static String input() {
         try (Scanner scanner = new Scanner(System.in)) {
            return scanner.nextLine();
        }
    }

    
    public static void testViewAddTodoList(){
        System.out.println("ToDoList");
        count = 2; // Reset count
        model[0] = "Satu";
        model[1] = "Dua";

        ViewAddToDoList();
        System.out.println("TODOLIST");
        ShowToDoList();
    }

    // Menampilkan View menghapus To Do List
    public static void ViewRemoveToDoList() {
        System.out.println("MENGHAPUS TODOLIST");
        ShowToDoList();
        System.out.print("Nomor yang Dihapus (x Jika Batal) : ");

        String number = input();

        if(number.equals("x")){
            // Batal
        }else{
        boolean success = RemoveToDoList(Integer.valueOf(number));
        if(!success){
            System.out.println("Gagal menghapus todoList: " + number);
        }
    }
}
    public static void testViewRemoveTodoList(){
        AddToDoList("Satu");
        AddToDoList("Dua");
        AddToDoList("Tiga");


        ViewRemoveToDoList();

        ShowToDoList();
    }
}