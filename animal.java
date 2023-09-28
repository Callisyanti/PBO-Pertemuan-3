public static class animal{
    string name;
    string age;

    public animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Umur: " + age);
    }
}