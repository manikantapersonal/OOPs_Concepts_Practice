interface Ne {
    void Lets();

    void Explain();// abstarct by default
}

class Demo implements Ne {
    public void Lets() {
        System.out.println("lets try the interface");
    }

    public void Explain() {
        System.out.println("explanation ");
    }
}

public class AbstarctionWithInterfaces {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.Explain();
    }
}
