class Manager {
    void Work() {
        System.out.println("the manager does the work with the motive of the profit generation to the boss");
    }
}

class Employee extends Manager {
    void Work1() {
        System.out.println("employee does the work on the motive of finishing the work");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Manager p = new Employee();
        p.Work();
    }

}
