public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("ping");
        MyThread t2 = new MyThread("pong");

        t1.start();
        t2.start();
    }
}
