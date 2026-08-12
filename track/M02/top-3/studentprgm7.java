
class Student {

    int id;
    String name;
    double height;

    void input(int id, String name, double height) {
        this.id = id;
        this.name = name;
        this.height = height;
    }

    void output() {
        System.out.println("ID:" + this.id);
        System.out.println("Name:" + this.name);
        System.out.println("Height:" + this.height);
    }
}

public class studentprgm7 {

    public static void main(String[] args) {
        Student s = new Student();
        s.input(12, "mahesh", 178.8);
        s.output();

    }
}
