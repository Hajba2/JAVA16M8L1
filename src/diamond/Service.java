package diamond;

public class Service implements A, B {

    public static void main(String[] args) {
        Service s = new Service();
        s.foo();
    }

    @Override
    public void foo() {
        B.super.foo();
    }
}
