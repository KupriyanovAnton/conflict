import second.SomeFromSecond;
import first.SomeFromFirst;

public class HW {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    public void doFromFirst() {
        SomeFromFirst someFromFirst = new SomeFromFirst();
        someFromFirst.sayHello();
    }


    public void doFromSecond() {
        SomeFromSecond someFromSecond = new SomeFromSecond();
        someFromSecond.sayHello();
    }
}
