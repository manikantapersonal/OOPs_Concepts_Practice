// lets understand this with basic and breif para inheritace is a method of aceessing the 
// properitesss of one class to another class

class Books {
    public void English() {
        System.out.println("here you can get the english books");
    }

    public void Telugu() {
        System.out.println(" you can get english books here");
    }

    public void Remaining() {
        System.out.println("you can find the remaning books here man");
    }
}

class Demo extends Books {
    // here lets aaccess the books with pen and remaining needs
    void Pen() {
        System.out.println("students can get the pen here ");
    }
}

public class InheitanceExample {
    public static void main(String[] args) {
        Demo b = new Demo();
        b.English();
        b.Pen();
    }
}
