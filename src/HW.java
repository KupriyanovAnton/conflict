import second.SomeFromSecond;

public class HW {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    public void doFromFirst() {
        System.out.println("First");
    }


    public void doFromSecond() {
        SomeFromSecond someFromSecond = new SomeFromSecond();
        someFromSecond.sayHello();
    }
}
