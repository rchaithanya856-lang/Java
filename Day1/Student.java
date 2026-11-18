package Training;
public class Student {

    Student() {
        System.out.println("Default Constructor");
    }

    Student(int a) {
        System.out.println("One Parameter Constructor: " + a);
    }

    Student(int a, int b) {
        System.out.println("Two Parameter Constructor: " + (a + b));
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student(10);

        Student s3 = new Student(10, 20);
    }
}


