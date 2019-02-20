package AnonymousClasses;

class A{
    A(int a){
        System.out.println("A");
    }
}

public class Main {

    public static void main(String[] args) {
	    new A(1){};

    }
}
