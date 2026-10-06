class GrandParent {
    GrandParent() {
        System.out.println("GrandParent Constructor");
    }
}

class Parent extends GrandParent {
    Parent() {
        super(); 
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child Constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}