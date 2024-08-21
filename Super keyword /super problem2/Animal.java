package Supermal;

class Animal {
    int x = 100;

    Animal() {
        System.out.println("superclass");
    }
}

class Dog extends Animal {
    int x = 200;

    Dog() {
        super(); // Call to superclass constructor
        System.out.println("childclass");
    }
    
    // Define a display method to access x value
    void display() {
        System.out.println("x:" + super.x);
    }
}



