package singleton.counter;

public class TestCounter {
    public static void main(String[] args) {
        Counter c1 = Counter.getInstance();
        Counter c2 = Counter.getInstance();
        c1.stepValue();
        System.out.println("Value= :" + c1.readValue());
        c2.stepValue();
        System.out.println("Value= :" + c2.readValue());
    }
}