// public class MyClass {
//     int x; // Instance variable

//     // Default constructor (no-arg constructor)
//     public MyClass() {
//         // No initialization tasks specified
//         // 'x' remains uninitialized
//     }

//     public static void main(String[] args) {
//         // Creating an object of MyClass
//         MyClass obj = new MyClass();

//         // Accessing instance variable 'x'
//         System.out.println("Value of x: " + obj.x); // Output: 0 (default value)
//     }
// }


// with initial value
// public class MyClass {
//     int x; // Instance variable

//     // Default constructor (no-arg constructor)
//     public MyClass() {
//         // Initialization tasks
//         x = 10; // Assigning a default value
//     }

//     public static void main(String[] args) {
//         // Creating an object of MyClass
//         MyClass obj = new MyClass();

//         // Accessing instance variable 'x'
//         System.out.println("Value of x: " + obj.x); // Output: 10
//     }
// }

//  constructor chaining

// class MyClass {
//     int x;

//     // First constructor with one parameter
//     public MyClass(int value) {
//         this.x = value;
//     }

//     // Second constructor with no parameters, calling the first constructor
//     public MyClass() {
//         this(0); // Calls the first constructor with value 0
//     }

//     public static void main(String[] args) {
//         // Creating objects using both constructors
//         MyClass obj1 = new MyClass(10);
//         MyClass obj2 = new MyClass();

//         System.out.println("Value of obj1.x: " + obj1.x); // Output: 10
//         System.out.println("Value of obj2.x: " + obj2.x); // Output: 0
//     }
// }



//  super keyword

// Superclass
class MyClass {
    int x;

    // Constructor with one parameter
    public MyClass(int x) {
        this.x = x;
    }

    // Method to display the value of x
    public void displayX() {
        System.out.println("Value of x: " + x);
    }
}

// Subclass inheriting from MyClass
class MySubClass extends MyClass {
    int y;

    // Constructor with two parameters
    public MySubClass(int x, int y) {
        super(x); // Call superclass constructor to initialize x
        this.y = y;
    }

    // Method to display the value of y
    public void displayY() {
        System.out.println("Value of y: " + y);
    }

    // Method to display the value of x using superclass method
    public void displayXUsingSuper() {
        super.displayX(); // Call superclass method to display x
    }



    public static void main(String[] args) {
        // Creating a MySubClass object
        MySubClass myObject = new MySubClass(10, 20);

        // Calling methods to display values of x and y
        myObject.displayXUsingSuper(); // Output: Value of x: 10
        myObject.displayY();           // Output: Value of y: 20
    }
}