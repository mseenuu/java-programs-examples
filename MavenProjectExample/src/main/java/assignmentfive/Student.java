package assignmentfive;

public class Student {

    int m1, m2, m3;

    // Constructor to get marks
    Student(int mark1, int mark2, int mark3) {
        m1 = mark1;
        m2 = mark2;
        m3 = mark3;
    }

    // Method to return total marks
    int getTotal() {
        return m1 + m2 + m3;
    }

    // Method to find grade
    static void findGrade(int total) {
        if (total >= 240) {
            System.out.println("Grade: A");
        } else if (total >= 180) {
            System.out.println("Grade: B");
        } else if (total >= 120) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }

    public static void main(String[] args) {

        // Student 1
        Student s1 = new Student(80, 75, 90);
        int total1 = s1.getTotal();
        System.out.println("Student 1 Total: " + total1);
        findGrade(total1);

        // Student 2
        Student s2 = new Student(60, 70, 65);
        int total2 = s2.getTotal();
        System.out.println("Student 2 Total: " + total2);
        findGrade(total2);
    }
}

