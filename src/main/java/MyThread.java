public class MyThread extends Thread {
    private final String value;
    private static Object syncObject = new Object();

    public MyThread(String value) {
        this.value = value;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (syncObject) {
                System.out.println(value);
                syncObject.notify();
                try {
                    syncObject.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
