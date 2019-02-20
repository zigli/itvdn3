package AnonymousClasses3;

interface Interface {
    void method();
}

public class Main {
    public static void main(String[] args) {
        Interface instance = new Interface() {
            public int publicField = 3;

            @Override
            public void method() {
                publicField = 1234;
                System.out.println("instance publicfield = " + getPublicField());
            }
            int getPublicField(){
                return publicField;
            }
        };
        instance.method();
    }
}
