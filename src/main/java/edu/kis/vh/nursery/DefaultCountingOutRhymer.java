package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int[] INTS = new int[12];
    private final int[] numbers = INTS;

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public final boolean callCheck() {
        return total == -1;
    }

    public final boolean isFull() {
        return total == 11;
    }

    protected final int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
