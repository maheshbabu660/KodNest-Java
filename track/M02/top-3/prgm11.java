class employee {
    int id ;
    String name;

    void work(){
        System.out.println("Working");
    }
}

class prgm11 {
    public static void main(String[] args) {
        employee emp1 = new employee();

        emp1.id = 1;
        emp1.name = "mahesh";
        System.out.println(emp1.id);
        System.out.println(emp1.name);
        emp1.work();

        employee emp2 = new employee();
        emp1 = emp2;
        
        emp2.id = 2;
        emp2.name = "mahi";
        System.out.println(emp1.id);
        System.out.println(emp1.name);
        System.out.println(emp2.id);
        System.out.println(emp2.name);

        
    }
}

    
