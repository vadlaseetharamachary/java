class student extends Thread {
    private String name;
    
    public student(String name) {
        this.name = name;
    }
    
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + " writing page " + i);
        }
        System.out.println(name + " completed writing");
    }
}

class ThdEx {
    public static void main(String args[]) {
        student t1 = new student("t1");
        t1.start();
        student t2 = new student("t2");
        t2.start();
    }
}