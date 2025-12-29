package assignmentfour;

public class StaticExample {

    static String name;
    static int age;
   
    static void setData() {
        name = "Seenu";
        age = 27;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }
    public static void main(String[] args) {
        setData();               
}
}


