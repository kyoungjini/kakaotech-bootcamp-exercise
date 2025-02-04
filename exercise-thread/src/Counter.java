public class Counter {
    private int value;

    public Counter(int value) {
        this.value = value;
    }

    public synchronized void increment() {
        this.value++;
    }

    public int getValue() {
        return value;
    }
}
