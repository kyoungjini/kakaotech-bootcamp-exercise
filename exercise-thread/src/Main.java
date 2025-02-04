public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(0);

        IncrementThread thread1 = new IncrementThread(counter);
        IncrementThread thread2 = new IncrementThread(counter);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        try {
            thread2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("counter의 value : " + counter.getValue());
    }
}