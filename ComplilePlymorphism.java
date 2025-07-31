class Diff {
    int sum(int a, int b) {
        System.out.println("twosum");
        return a + b;
    }

    int sum(int a, int b, int c) {
        System.out.println("threesum");
        return a + b + c;
    }
}

public class ComplilePlymorphism {
    public static void main(String[] args) {
        Diff d = new Diff();

        d.sum(10, 20);
        int a = d.sum(10, 20, 30);
        System.out.println(a);
    }

}
