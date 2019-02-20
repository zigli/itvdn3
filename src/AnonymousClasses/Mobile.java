package AnonymousClasses;

public class Mobile extends Computer{
    Phone createPhone(){
        return new Phone(){
            @Override
            void process() {
                super.process();
                System.out.println("Mobile");
            }
        };
    }

    @Override
    void process(){
        super.process();
        System.out.println("Phone");
    }
}
