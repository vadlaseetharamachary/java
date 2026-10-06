class Parent {
    void display() {
        System.out.println("Display method from Parent class");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Display method from Child class");
    }

    void show() {
        super.display();
        display();       
    }
}

public class SuperMethodDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
