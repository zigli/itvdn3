package AnonymousClasses6;

interface Interface {
    void method();

    int getValue();
}

class ConcreteClass implements Interface{
    protected int protectedField = 10;

    @Override
    public void method() {
        System.out.println("ConcreteClass: method()");
    }

    @Override
    public int getValue() {
        return protectedField;
    }
}

public class Main {
    public static void main(String[] args) {
        ConcreteClass instance = new ConcreteClass();
        instance.method();

        ConcreteClass instance1 = new ConcreteClass(){
            @Override
            public void method() {
                super.method();
                System.out.println("instance1: method()");
            }
        };

        Interface instance2 = new ConcreteClass() {
            int protectedField = 3;

            @Override
            public void method() {
                System.out.println("instance2: method()");
            }

            @Override
            public int getValue() {
                return this.protectedField + super.getValue();
            }
        };

        instance1.method();
        instance2.method();
        System.out.println("instance1 field: " + instance1.getValue());
        System.out.println("instance3 field: " + instance2.getValue());

    }
}
