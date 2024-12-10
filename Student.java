public class Student {
    String name;
    int age;

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name; // Initialize 'name' with the passed value
        this.age = age; // Initialize 'age' with the passed value
    }

    public static void main(String[] args) {
        // Creating objects of Student class using parameterized constructor
        Student student1 = new Student("Mahfooz", 20);
        Student student2 = new Student("Alam", 22);

        // Accessing object attributes
        System.out.println("Student 1: Name - " + student1.name + ", Age - " + student1.age);
        System.out.println("Student 2: Name - " + student2.name + ", Age - " + student2.age);
    }
}
