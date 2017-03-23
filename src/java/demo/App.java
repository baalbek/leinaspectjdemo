package demo;

public class App {

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        int result = demo1.calc1(343);
        System.out.println("App: " + result);
        result = demo1.calc1(343);
        System.out.println("App 2: " + result);
    }

}
