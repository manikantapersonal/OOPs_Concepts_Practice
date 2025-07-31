abstract class Library {
    abstract void Books();

    abstract void Chairs();

    void Permission() {
        System.out.println("grant the permission with any one");
    }
}

class Central extends Library {
    void Books() {
        System.out.println("books are at the first track");
    }

    void Chairs() {
        System.out.println("chairs are at the first one");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Central c = new Central();
        c.Books();
        c.Permission();
    }
}