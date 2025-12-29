package assignmentseven;

public class StudentDetails {
    public static void main(String[] args) {

        
        Student student = new Student("Akhil", 101);

        
        Address address = new Address("Kochi", "Kerala", "India");

        
        System.out.println("Student Name : " + student.name);
        System.out.println("Roll Number  : " + student.rollNumber);
        System.out.println("Address      : " + address.city + ", " + address.state + ", " + address.country);
    }
}