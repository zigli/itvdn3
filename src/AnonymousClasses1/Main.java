package AnonymousClasses1;

interface Interface1{
    void method();
}


public class Main {
    public static void main(String[] args) {
        Interface1 instance = new Interface1() {
            @Override
            public void method() {
                System.out.println("Call method() from anonymous class");
            }
        };

        instance.method();
    }
}
