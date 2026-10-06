class Parent {
    String name = "Parent Class Variable";
}

class Child extends Parent {
    String name = "Child Class Variable";

    void display() {
        System.out.println("Child name: " + name);
        System.out.println("Parent name: " + super.name);
    }
}

public class SuperVariableDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}